package ilara;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;




public class Ilara<E> implements Queue<E> {
	private Nodo bukaerakoa; // ilararen bukaera (elementuen eransketak)
	private Nodo hasierakoa; // ilararen hasiera (elementuen atzipenak eta ezabaketak)

	private class Nodo {
		E datua;
		Nodo hurrengoa;

		public Nodo(E datua) {
			this.datua = datua;
			this.hurrengoa = null;
		}
	}

	private class IlaraIteradorea implements Iterator<E> {

		private Nodo unekoa;
		
		//Eraikitzailea
		public IlaraIteradorea() {
			
			unekoa = hasierakoa;
		}
		
		@Override
		public boolean hasNext() {
			
			return unekoa!=null;
		}

		@Override
		public E next() {
			E lag = unekoa.datua;
			unekoa = unekoa.hurrengoa;
			return lag;
		}

		
		
	}

	public Ilara() { // eraikitzailea
		hasierakoa = null;
		bukaerakoa = null;
	}


	@Override
	public Iterator<E> iterator()  {
		
		
		return new IlaraIteradorea();
				
	}

	
	@Override
	public boolean add(E arg0) {
		if (bukaerakoa == null) {
			Nodo nodoBerria = new Nodo(arg0);
			hasierakoa = nodoBerria;
			bukaerakoa = nodoBerria;
			return true;
		} else {
			Nodo nodoBerria = new Nodo(arg0);
			bukaerakoa.hurrengoa = nodoBerria;
			bukaerakoa = nodoBerria;
			return true;
		}
	}

	@Override
	public E peek() {
		if (this.isEmpty()) {
			return null;
		} else {
			return hasierakoa.datua;
		}
	}

	@Override
	public E poll() {
		E lag;
		if (this.isEmpty()) {
			return null;
		} else {
			lag = hasierakoa.datua;
			if (hasierakoa == bukaerakoa) {
				hasierakoa = null;
				bukaerakoa = null;
			} else {
				hasierakoa = hasierakoa.hurrengoa;
			}
			return lag;
		}
	}

	@Override
	public E remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		E lag;
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			lag = hasierakoa.datua;
			if (hasierakoa == bukaerakoa) {
				hasierakoa = null;
				bukaerakoa = null;
			} else {
				hasierakoa = hasierakoa.hurrengoa;
			}
			return lag;
		}
	}


	
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (hasierakoa == null);
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}

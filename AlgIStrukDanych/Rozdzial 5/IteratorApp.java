
class Link {
	public int data;
	public Link next;
	public Link(int data) {
		this.data = data;
	}
	public void displayLink() {
		System.out.print(data + " ");
	}
}
class LinkList {
	private Link first;
	public LinkList() {
		first = null;
	}
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link f) {
		first = f;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
class ListIterator {
	private Link current;
	private Link previous;
	private LinkList list;
	public ListIterator(LinkList list) {
		this.list = list;
		reset();
	}
	public void reset() {
		current = list.getFirst();
		previous = null;
	}
	public boolean atEnd() {
		return (current.next == null);
	}
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	public Link getCurrent() {
		return current;
	}
	public void insertAfter(int data) {
		Link link = new Link(data);
		if(list.isEmpty()) {
			list.setFirst(link);
			current = link;
		} else {
			link.next = current.next;
			current.next = link;
			nextLink();
		}
	}
	public void insertBefore(int data) {
		Link link = new Link(data);
		if(previous == null) 
			list.setFirst(link);
	    else
	    	previous.next = link;
		link.next = current;
		current = link;
	}
	public int deleteCurrent() {
		int n = current.data;
		if(list.isEmpty()) {
			System.out.print("Lista jest pusta!");
			return 0;
		} else if (previous == null) {
			list.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd())
				reset();
			else
				current = current.next;
		}
		return n;
	}
}
class IteratorApp {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		ListIterator iter = list.getIterator();
		for(int i=0; i<10; i++)
		iter.insertAfter(i);
		list.displayList();
//		iter.reset();
//		iter.nextLink();
//		iter.nextLink();
		iter.getCurrent().displayLink();
//		System.out.println("");
		System.out.println("Usunięto: " + iter.deleteCurrent());
		list.displayList();
		iter.getCurrent().displayLink();
	}
}
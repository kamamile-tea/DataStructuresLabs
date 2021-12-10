package lab3;

public interface List<E> {
  public E get(int pos);
  public void set(int pos, E value);
  public void add(int pos, E value);
  public E remove(int pos);
  public int size();
  public boolean isEmpty();
  public String toString();
  public int capacity();

}
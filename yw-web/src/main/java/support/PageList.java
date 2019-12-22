package support;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;

@ApiModel(
        value = "带分页查询的数据列表",
        description = "继承 List 接口，增加了总条数的属性"
)
public class PageList<E> implements List<E> {
    private List<E> records = new ArrayList();
    @ApiModelProperty("本次查询的数据总条数")
    private int totalSize = 0;

    public PageList() {
    }

    @Override
    public int size() {
        return this.records.size();
    }

    @Override
    public boolean isEmpty() {
        return this.records.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.records.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.records.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.records.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.records.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return this.records.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.records.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.records.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.records.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return this.records.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.records.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.records.retainAll(c);
    }

    @Override
    public void clear() {
        this.records.clear();
    }

    @Override
    public boolean equals(Object o) {
        return this.records.equals(o);
    }

    @Override
    public int hashCode() {
        return this.records.hashCode();
    }

    @Override
    public E get(int index) {
        return this.records.get(index);
    }

    @Override
    public E set(int index, E element) {
        return this.records.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        this.records.add(index, element);
    }

    @Override
    public E remove(int index) {
        return this.records.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return this.records.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.records.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.records.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return this.records.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return this.records.subList(fromIndex, toIndex);
    }

    public List<E> getRecords() {
        return this.records;
    }

    public int getTotalSize() {
        return this.totalSize;
    }

    public void setRecords(final List<E> records) {
        this.records = records;
    }

    public void setTotalSize(final int totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "PageList(records=" + this.getRecords() + ", totalSize=" + this.getTotalSize() + ")";
    }
}
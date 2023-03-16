package project;

import java.util.Iterator;
import java.util.Scanner;

public class DictionaryList<K, V> implements DictionaryInterface<K, V> {

    private ListInterface<K> kList;
    private ListInterface<V> vList;
    private static final int MAX_CAPACITY = 100;
    private int numberOfEntries;

    public DictionaryList() {
	kList = new AList(100);
	vList = new AList(100);
	for (int i = 1; i <= 100; i++) {
	    kList.add(i, null);
	    vList.add(i, null);
	}
    }

    int hash(K key) {
	return (1 + Integer.parseInt((String) key) % 100);
    }

    public V add(K key, V value) {
	int index = hash(key);
	kList.replace(index, key);
	vList.replace(index, value);

	numberOfEntries++;
	return value;
    }

    public V remove(K key) {
	int index = hash(key);
	V temp = getValue(key);
	//if (temp != null){
	kList.replace(index, null);
	vList.replace(index, null);
	return temp;
    }

    public V getValue(K key) {
	V temp = (V) vList.getEntry(hash(key));
	return temp;
    }

    public boolean contains(K key) {
	if (this.getValue(key) == null) {
	    return false;
	} else {
	    return true;
	}
    }

    public boolean isEmpty() {
	return numberOfEntries == 0;
    }

    public int getSize() {
	return numberOfEntries;
    }

    public void clear() {
	for (int i = 1; i <= 100; i++) {
	    kList.replace(i, null);
	    vList.replace(i, null);
	    numberOfEntries = 0;
	}
    }

    @Override
    public Employee getValue(Scanner data) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

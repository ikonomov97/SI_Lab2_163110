import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class SI_Lab_2Test {


    @Test
    void everyBranch() {
        final SILab2 SiLab = new SILab2();

        final List<Time> vreme1 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer = new Time(10,10,10);
        vreme1.add(testprimer);


        final List<Time> vreme2 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer1 = new Time(-1,15, 15);
        vreme2.add(testprimer1);


        final List<Time> vreme3 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer2 = new Time(25,10,10);
        vreme3.add(testprimer2);


        final List<Time> vreme4 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer3 = new Time(10,-1,10);
        vreme4.add(testprimer3);


        final List<Time> vreme5 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer4 = new Time(5,5,61);
        vreme5.add(testprimer4);


        final List<Time> vreme6 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time testprimer5 = new Time(24,2,2);
        vreme6.add(testprimer5);

        final List<Time> expected = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };


        assertEquals(expected,SiLab.function(vreme1)); //10,10,10
        assertEquals("Exeption:hours are smaller than the minimum",SiLab.function(vreme2));
        assertEquals("Exeption: hours are grater than the maximum",SiLab.function(vreme3));
        assertEquals("Exeption: minutes are not valid!",SiLab.function(vreme4));
        assertEquals("Exeption: seconds are not valid",SiLab.function(vreme5));
        assertEquals("Exeption: time is greater than the maximum",SiLab.function(vreme6));
    }

}
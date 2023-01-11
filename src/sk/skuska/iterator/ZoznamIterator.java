package sk.skuska.iterator;

public class ZoznamIterator<T> implements Iterator<T>{
    private Zoznam<T> zoznam;
    int index;

    public ZoznamIterator(Zoznam<T> zoznam) {
        this.zoznam = zoznam;
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        if (this.index < this.zoznam.size()) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return this.zoznam.size() == this.index;
    }

    @Override
    public T currentItem() {
        if(this.index < this.zoznam.size()){
            return this.zoznam.get(this.index);
        }
        return null;
    }
}

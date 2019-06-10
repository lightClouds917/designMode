package com.java4all.iterator;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class TitleCollection implements CollectionNew{

    public String titles[] = {"分布式事务基本概念","2pc原理及实现","3pc原理及实现","tcc原理及实现"};

    @Override
    public IteratorNew getIteratorNew() {
        return new TitleIterator();
    }

    private class TitleIterator implements IteratorNew{

        int index;

        @Override
        public boolean hasNext() {
            if(index < titles.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return titles[index ++];
            }
            return null;
        }
    }
}

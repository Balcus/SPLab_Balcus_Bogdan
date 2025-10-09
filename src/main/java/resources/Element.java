package resources;

import lombok.Getter;

@Getter
public abstract class  Element {
    protected Object parent;

    public void setParent(Object parent) throws UnsupportedOperationException {
        if (parent instanceof Book || parent instanceof Section) {
            this.parent = parent;
            return;
        }
        throw new UnsupportedOperationException("The classed used cannot be a parent");
    }

    public abstract void print();
    public abstract void add(Element element) throws Exception;
    public abstract void removeElement(Element element);
    public abstract Element getElement(int i);
}

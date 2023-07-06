package module5.Task1;

class Box<T> { //<T> - тип параметра
    private T object;
    public Box(T object){
        this.object = object;
    }
    public T getObject(){
        return object;
    }
    public void setObject(T object){
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box {" +
                "object= " + object +
                '}';
    }
}

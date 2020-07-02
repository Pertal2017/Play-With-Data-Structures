public class Array {

    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e){
       /*
       if(size == data.length)
            throw new IllegalArgumentException("AddLast failed.Array is full.");
        data[size] = e;
        size++;
        */

        //方法复用，减少代码量
        add(size,e);
    }

    // 在所有元素前添加一个元素
    public void addFirst(int e){
        add(0,e);
    }

    //在第index个位置插入一个新元素e
    public void add(int index, int e){
        //判断size是否和数组的长度相等，如果相等那么就不能插入
        //原因是数组是从0开始索引，所以size如果和数组长度相同那么就溢出一位了
        if(size == data.length)
            throw new IllegalArgumentException("Add failed.Array is full.");
        //索引不能小于0 小于0 那么就是溢出的情况 因为索引下标从0开始
        //index 不能大于 size，大于size也出现溢出的情况
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed.Require index >= 0 and index <= size.");
        //逻辑分析
        //size是现在还没有存放的索引
        //size - 1 会取到最后一次存放的数值
        //每次递减，直到这个值等于index,index这个是索引的下标
        //i值的后一位存放现在的i值，因为后一位是空的
        for(int i = size - 1 ; i >= index ; i--)
            data[i + 1] = data[i];
        data[index] = e;
        //对size++的操作，是因为size已经被填了
        size++;

        /*
        *  NOTE:
        * 1. 特别情况 index == size
        * 这里index == size的时候其实就是在最后一位添加
        * 同时这里的for循环其实是不操作的，因为此时的 i == size
        * 2. 特别情况 index == 0
        * 其实这里并不怎么特殊 具体如下例子
        * 原来数组 1 2 3 4 要求在索引0的位置插入一个
        * 那么数组变成 空出 1 2 3 4
        * 然后对索引0的位置赋值即可
        */
    }

    // 获取index索引位置的元素
    int get(int index){
        //index 小于 0 时 索引溢出
        //index 大于等于 size时 此时该位置的索引并没有值
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        return data[index];
    }

    // 修改index索引位置的元素为e
    void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(int e){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == e)
                return true;
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(int e){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素，返回删除的元素
    public int remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed.Index is illegal.");
        int ret = data[index];

        for (int i = index + 1 ; i < size ; i++){
            data[i - 1] = data[i];
        }
        size--;

        return ret;
    }

    // 从数组中删除第一个元素，返回删除的元素
    public int removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素，返回删除的元素
    public int removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(int e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    //更新版本 boolean类型  判断是否删除成功

    //findall 与 removeall 可以尝试完成

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d , capacity = %d\n",size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}

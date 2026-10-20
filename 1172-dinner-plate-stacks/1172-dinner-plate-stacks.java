class DinnerPlates {
    int capacity;
    List<Stack<Integer>> stacks;
    TreeSet<Integer> available;

    public DinnerPlates(int capacity) {
        this.capacity = capacity;
        stacks = new ArrayList<>();
        available = new TreeSet<>();
    }
    
    public void push(int val) {
        if(capacity <= 0){
            return;
        }

        if(!available.isEmpty()){
            int index = available.first();

            stacks.get(index).push(val);

            if(stacks.get(index).size() == capacity){
                available.remove(index);
            }
        }else{
            Stack<Integer> newStack = new Stack<>();
            newStack.push(val);

            stacks.add(newStack);

            if(capacity > 1){
                available.add(stacks.size() - 1);
            }
        }
    }
    
    public int pop() {
        while(!stacks.isEmpty() && stacks.get(stacks.size() - 1).isEmpty()){
            int lastIndex = stacks.size() - 1;
            stacks.remove(lastIndex);
            available.remove(lastIndex);
        }

        if(stacks.isEmpty()){
            return -1;
        }

        return popAtStack(stacks.size() - 1);
    }
    
    public int popAtStack(int index) {
        if(index < 0 || index >= stacks.size()){
            return -1;
        }

        if(stacks.get(index).isEmpty()){
            return -1;
        }

        int val = stacks.get(index).pop();

        available.add(index);

        return val;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */
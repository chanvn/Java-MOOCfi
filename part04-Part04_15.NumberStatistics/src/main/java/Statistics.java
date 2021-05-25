
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        this.count=0;
        this.sum=0;
    }
    
    public void addNumber(int number){
        this.count++;
        sum+=number;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public double average(){
        if (count>0)
        return 1.0*sum/count;
        
        return 0;
    }
    
}

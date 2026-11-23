public class DataSet{ 
    private double[] data; 
    private int dataSize; 
    private double sum; 
    public DataSet() {
         data = new double[100];
         dataSize = 0; sum = 0; 
        } 
    public void add(double value) {
        data[dataSize] = value; dataSize++; sum += value; 
    } 
    public double getAverage() { 
     if (dataSize == 0)
        { return 0; } 
    else 
        { return sum / dataSize; }
    }
    public double getStandardDeviation(){
        double dataSum = 0;
        for(int i = 0; i <= dataSize; i++){
            dataSum = dataSum + data[i];
        }
        if (dataSize <= 1){
            return 0.01
        }else{
             return dataSum / dataSize;
        }
    }
}
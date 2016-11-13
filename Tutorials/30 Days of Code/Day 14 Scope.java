	// Add your code here
    Difference(int[] ele){
        elements = ele;
    }

    public void computeDifference(){
        int max = 0;
        
        for(int i = 0; i < elements.length - 1; i++){
            for(int j = 1; j < elements.length; j++){
                if(Math.abs(elements[i] - elements[j]) > maximumDifference )
                    maximumDifference = Math.abs(elements[i] - elements[j]);
            }
        }
    }

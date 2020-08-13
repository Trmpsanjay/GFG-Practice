 int min=input[si];
        int count=0;
        for(int i=si+1;i<=ei;i++){
            if(input[i]<=min)
                count++;
        }
        //System.out.println(count);
        int pivot=si+count;
        int temp=input[si];
        input[si]=input[pivot];
        input[pivot]=temp;
        // for(int i=si;i<=ei;i++){
        //     System.out.print(input[i]+" ");
        // }
        int i=si;
        int j=ei;
        while(i<pivot && j>pivot){
            if(input[i]<=input[pivot])
        			i++;
        		else if(input[j]>input[pivot])
        			j--;
        		else{
        			int temp1=input[i];
        			input[i]=input[j];
        			input[j]=temp1;
        			i++;
        			j--;
                }
        }
        return pivot;

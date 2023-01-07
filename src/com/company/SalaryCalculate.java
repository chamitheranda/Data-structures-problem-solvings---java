package com.company;

public class SalaryCalculate {
    public void calculateSalary(int id){
        WorkDetails array1[] = new WorkDetails[3];
        array1[0] = new WorkDetails(1001,8);
        array1[1] = new WorkDetails(2001,4);
        array1[2] = new WorkDetails(3001,3);
        Details arr1[] = new Details[5];
        arr1[0] = new Details(1 , "Rock",600 ,array1);

        WorkDetails array2[] = new WorkDetails[3];
        array2[0] = new WorkDetails(2001,7);
        array2[1] = new WorkDetails(3001,5);
        array2[2] = new WorkDetails(1001,6);
        arr1[1] = new Details(2 , "Electronic",800 ,array2 );

        WorkDetails array3[] = new WorkDetails[3];
        array3[0] = new WorkDetails(1001,5);
        array3[1] = new WorkDetails(2001,6);
        array3[2] = new WorkDetails(4001,4);
        arr1[2] = new Details(3 , "Hip Hop Music",400 ,array3);

        WorkDetails array4[] = new WorkDetails[3];
        array4[0] = new WorkDetails(6001,8);
        array4[1] = new WorkDetails(4001,6);
        array4[2] = new WorkDetails(5001,7);
        arr1[3] = new Details(4 , "Jazz",500 ,array4);

        WorkDetails array5[] = new WorkDetails[3];
        array5[0] = new WorkDetails(5001,5);
        array5[1] = new WorkDetails(3001,7);
        array5[2] = new WorkDetails(6001,4);
        arr1[4] = new Details(5 , "Death Metal",700 ,array5);

        double salary=0;
        for (int i=0 ; i<5 ; i++){
           if(i==0){
               for(int j=0 ; j<3 ; j++){
                  if( array1[j].artistNO == id ){
                      salary += array1[j].noOfSongs * arr1[i].payRate ;
                      break;
                  }
               }
            }

            if(i==1){
                for(int j=0 ; j<3 ; j++){
                    if( array2[j].artistNO == id ){
                        salary += array2[j].noOfSongs * arr1[i].payRate ;
                        break;
                    }
                }
            }

            if(i==2){
                for(int j=0 ; j<3 ; j++){
                    if( array3[j].artistNO == id ){
                        salary += array3[j].noOfSongs * arr1[i].payRate ;
                        break;
                    }
                }
            }

            if(i==3){
                for(int j=0 ; j<3 ; j++){
                    if( array4[j].artistNO == id ){
                        salary += array4[j].noOfSongs * arr1[i].payRate ;
                        break;
                    }
                }
            }

            if(i==4){
                for(int j=0 ; j<3 ; j++){
                    if( array5[j].artistNO == id ){
                        salary += array5[j].noOfSongs * arr1[i].payRate ;
                        break;
                    }
                }
            }
        }
        System.out.println("salary of artist number "+id+" = "+ salary);
    }
}

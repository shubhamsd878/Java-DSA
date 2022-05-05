#include<iostream>
using namespace std; 
bool isSafe(int** arr, int x, int y, int n){
    if(x < n && y<n && arr[x][y]==1)
        return true;
    return false;
}

bool ratinMaze(int** arr, int x, int y, int n, int** solArr){
    if(x== n-1 && y == n-1 ){
        solArr[x][y]=1;
        return true;
    }
    if(isSafe(arr,x ,y ,n)){
        if(ratinMaze(arr, x+1, y, n, solArr)){
            return true;
        }
        if(ratinMaze(arr, x, y+1, n, solArr)){
            return true;
        }
        solArr[x][y] = 0;       /backtracking
        return false;
    }
}

int main()
{
    // cout<<"hello world";
     int n=5;   
    int** arr=new int*[n];                  //Most Important, practice it!
    for(int i=0; i<n; i++){
        arr[i] = new int[n];                //IMPORTANT CPP : dynamically 2d array
    }

    int** solArr=new int*[n];
    for(int i=0; i<n; i++){
        solArr[i] = new int[n];                //IMPORTANT CPP : dynamically 2d array
        for(int j=0; j<n; j++)
        solArr[i][j] = 0;
    }

    for(int i=0; i<n;i++){
        for(int j=0;j<n;j++)
        cin >> arr[i][j];
    cout << endl;
    }
 
    if(ratinMaze(arr, 0, 0,n, solArr)){
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++)
            cout<<(arr[i][j] + "\t");
        cout<<endl;
        }
 
    return 0;
    }
}
// 1 0 1 0 1
// 1 1 1 1 1
// 0 1 0 1 0
// 1 0 0 1 1
// 1 1 1 0 1
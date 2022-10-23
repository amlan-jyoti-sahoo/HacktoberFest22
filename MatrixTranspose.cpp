#include <iostream>
using namespace std;
int row, col;
int main()
{
    int val, row, col;
    cin >> row;
    cin >> col;
    int a[row][col];

    cout << "\n a: \n";
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cin >> val;
            a[i][j] = val;
        }
    }

    int b[col][row];
    for (int j = 0; j < row; j++)
    {
        for (int i = 0; i < col; i++)
            b[i][j] = a[j][i];
    }

    for (int i = 0; i < col; i++)
    {
        for (int j = 0; j < row; j++)
            a[i][j] = b[i][j];
    }

    for (int i = 0; i < col; i++)
    {
        for (int j = 0; j < row; j++)
            cout << a[i][j] << " ";
        cout << "\n";
    }

    return 0;
}
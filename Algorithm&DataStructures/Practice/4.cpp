//
// Created by 2398768715 on 2023/3/16.
//
#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int a, b, c, d, k;
    //number of bacteria,
    // number of bacterias created by 1 bacteria everyday,
    // every day usage of bacteria
    // container capacity of bacterias
    // search day k

    //scanf("%d%d%d%d%d", &a, &b, &c, &d, &k);
    //I don't know why there will be WA while using scanf() and printf() in test 23

    cin >> a >> b >> c >> d >> k;

    //for every day-i
    for (int i = 0; i < k; i++){
        a = a * b;//every day increase
        a -= min(a, c);//every day usage for experiment

        if (a == 0) {//experiment ends
            break;
        } else if (a > d) {//experiment continue and bacterias overflow
            a = d;
            break;
        } else if (a == a * b - min(a * b, c)) {//experiment continue and bacterias come to balance
            break;
        }
    }

    //printf("%d", a);
    cout << a << endl;

    return 0;
}
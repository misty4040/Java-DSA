//package Stack1;
//
//public class prefix {
//    #include<bits/stdc++.h>
//    using namespace std;
//
//    int prefix(string s){
//        stack<int> ms;
//
//        for(int i=s.length()-1;i>=0;i--){
//            if(s[i]>='0' && s[i]<='9'){
//                ms.push(s[i]-'0');
//            }else{
//                int o1=ms.top();
//                ms.pop();
//                int o2=ms.top();
//                ms.pop();
//
//                switch(s[i]){
//                    case '+':
//                        ms.push(o1+o2);
//                        break;
//                    case '-':
//                        ms.push(o1-o2);
//                        break;
//                    case '*':
//                        ms.push(o1*o2);
//                        break;
//                    case '^':
//                        ms.push(pow(o1,o2));
//                        break;
//                }
//            }
//        }
//        return ms.top();
//    }
//
//    int main(){
//        cout<<prefix("-+7*45^20");
//        return 0;
//    }
//}

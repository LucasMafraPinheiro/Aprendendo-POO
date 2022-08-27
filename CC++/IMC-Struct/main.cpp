#include <iostream>
#include "queue.h"
#include "pessoa.h"

using namespace std;

int main()
{
    Node *head=nullptr;
    while(true){
        pessoa novaPessoa;
        cout<<"Digite nome da pessoa\n";
        cin>>novaPessoa.nome;
        cout<<"Digite altura da pessoa\n";
        cin>>novaPessoa.altura;
        cout<<"Digite peso da pessoa\n";
        cin>>novaPessoa.peso;
        cout<<"Digite idade da pessoa\n";
        cin>>novaPessoa.idade;
        addNode(head,novaPessoa);
        showQ(head);
    }
}

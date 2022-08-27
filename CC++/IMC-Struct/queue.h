#include "pessoa.h"
#include <iostream>
#include <string>
#ifndef QUEUE
#define QUEUE

struct Node{
    pessoa dado;
    Node*proximo;
};


void addNode(Node *&head, pessoa nDado){
    Node *aloc=new Node();
    aloc->proximo=head;
    aloc->dado=nDado;
    head=aloc;
}

void showQ(Node *head){
        Node *nav=head;
        if(nav==nullptr){
            std::cout<<"listvazia\n";
            return;
        }
        std::cout<<"------------------------------------------\n";
        while (nav!=nullptr){
            std::cout<<"nome: " << nav->dado.nome;
            std::cout<<", altura: " << nav->dado.altura;
            std::cout<<", idade: " << nav->dado.idade;
            std::cout<<", IMC: ";
            //cout<<fixed<<setprecision(3)<<q->data.imc;
            std::cout<<"\n";
            nav=nav->proximo;
        }
        std::cout<<"------------------------------------------\n";
}

#endif // QUEUE

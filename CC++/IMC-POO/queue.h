#include "pessoa.h"
#include <iostream>
#include <string>
#ifndef QUEUE
#define QUEUE

class Node{
public:
    pessoa dado;
    Node* proximo;
    Node(){
        proximo=nullptr;
    }
    Node(pessoa nDado){
        this->dado=nDado;
        this->proximo=nullptr;
    }
};

class linkedPessoas{
    Node *head;
    public:
    linkedPessoas(){
        head=nullptr;
    }
    void addPessoa(pessoa novaPessoa){
        Node *aloc= new Node;
        aloc->dado=novaPessoa;
        if(head==nullptr){
            head=aloc;
            return;
        }
        Node *nav=head;
        while(nav->proximo!=nullptr){
            nav=nav->proximo;
        }
        nav->proximo=aloc;
    }

    void showQ(){
        Node *nav=head;
        if(head==nullptr){
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
};
#endif // QUEUE

#include <iostream>
#include <iomanip>
#include "pessoa.h"
#include "queue.h"
using namespace std;


void calcularIMC(pessoa calculado){
    calculado.imc=234;
    return;
}


int main()
{
    linkedPessoas lista;
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
        calcularIMC(novaPessoa);
        lista.addPessoa(novaPessoa);
        lista.showQ();
    }
}

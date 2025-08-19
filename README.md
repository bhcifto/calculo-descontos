# calculo-descontos

1- Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?
R. Strategy.

2- Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?
R. Poderíamos usar estruturas condicionais como if-else ou switch.

3- Quais os problemas que tal implementação traria?
R. Teriamos forte acoplamento do calculo de desconto com a regra de negócio, logo o método ficaria extenso e complexo, o que dificultaria manutenção e testes;
Para adicionar mais tipos de descontos, precisariamos mdificar o método

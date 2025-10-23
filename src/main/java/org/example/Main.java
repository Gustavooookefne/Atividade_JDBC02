package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            inicio();

        }
        public static void inicio(){
            boolean sair = false;
            System.out.println(""" 
                Sistema de gestão de almoxarifado Industrial
                 1 - Cadastrar Fornecedor
                 2 - Cadastrar Material
                 3 - Registar Nota de Entrada
                 4 - Criar Requisição do Material
                 5 - Atender Requisição
                
                """);
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:{

                }

                case 0:{
                    sair
                }
            }
        }
        public static void cadastrarFornecedor(){
            System.out.println("CADASTRO DE FORNECEDOR");
            System.out.println("\n");
            System.out.println("Digite o nome do fornecedor: ");
            String nome = sc.nextLine();
            System.out.println("Digite o cnpj do fornecedor: ");
            String cnpj = sc.nextLine();

            if(nome.isEmpty() || cnpj.isEmpty()){
                var fornecedorDao = new FornecedorDao();
                try{
                    if(fornecedorDao.cnpjExiste(cnpj)){

                    }
                }catch (SQLException e){
                    System.out.println("ERRO no banco de dados!");
                    e.
                }
            }

            }
        }
    }

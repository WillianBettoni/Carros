package prjtrabalhocarros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrjTrabalhoCarros {

    public static void main(String[] args) throws IOException {
        String option1;
        int aux1 = 0;
        boolean numero1;
        int formaAtual = 0;
        boolean movimento = false;
        boolean voarJato = false;
        boolean voarHelicoptero = false;
        boolean navegar = false;
        boolean carcaca = false;
        boolean asas = false;
        boolean helices = false;
        boolean ancora = false;

        Scanner entrada = new Scanner(System.in);

        Hibrido hibrido = new Hibrido();

        Montadora mont = new Montadora();

        try {
            do {

                System.out.println("");
                System.out.println("** Trabalho POO **");
                System.out.println("");

                hibrido.mostrarVeiculoAtual();
                System.out.println("");
                System.out.println("1 - Ligar Veículo");
                System.out.println("2 - Alterar Transformação");
                System.out.println("3 - Configurações do Sistema");
                System.out.println("9 - Desligar Veículo");
                System.out.println("");

                System.out.print("Informe a opção: ");
                option1 = entrada.next();
                System.out.println("");

                try {
                    aux1 = Integer.parseInt(option1);
                    numero1 = true;
                } catch (NumberFormatException e) {
                    numero1 = false;
                }

                if (numero1) {

                    switch (aux1) {
                        case 1:

                            String option2;
                            int aux2 = 0;
                            boolean numero2;

                            do {

                                System.out.println("");
                                System.out.println("0 - Retornar ao menu principal");
                                System.out.println("1 - Iniciar Movimento");
                                System.out.println("2 - Parar Movimento");
                                System.out.println("3 - Virar para a Direita");
                                System.out.println("4 - Virar para a Esquerda");

                                if (formaAtual == 0) {
                                    System.out.println("");
                                    System.out.println("5 - Trocar Marcha");
                                    System.out.println("6 - Andar para trás");
                                    System.out.println("7 - Trocar Pneu");

                                }

                                if (formaAtual == 1) {
                                    System.out.println("");
                                    System.out.println("5 - Voar");
                                    System.out.println("6 - Aterrisar");
                                    System.out.println("7 - Trocar marcha");
                                    System.out.println("8 - Acionar asas");
                                    System.out.println("9 - Recolher asas");
                                }

                                if (formaAtual == 2) {
                                    System.out.println("");
                                    System.out.println("5 - Navegar");
                                    System.out.println("6 - Ancorar");
                                    System.out.println("7 - Trocar marcha");
                                    System.out.println("8 - Andar para trás");
                                    System.out.println("9 - Acionar carcaça");
                                    System.out.println("10 - Recolher carcaça");
                                    System.out.println("11 - Recolher âncora");
                                }

                                if (formaAtual == 3) {
                                    System.out.println("");
                                    System.out.println("5 - Voar");
                                    System.out.println("6 - Aterrisar");
                                    System.out.println("7 - Trocar marcha");
                                    System.out.println("8 - Acionar Hélices");
                                    System.out.println("9 - Recolher Hélices");

                                }

                                System.out.println("");
                                System.out.print("Informe a opção: ");
                                option2 = entrada.next();
                                System.out.println("");

                                try {
                                    aux2 = Integer.parseInt(option2);
                                    numero2 = true;
                                } catch (NumberFormatException e) {
                                    numero2 = false;
                                }

                                if (numero2) {
                                    switch (aux2) {
                                        case 0:
                                            System.out.print("Retornando ao menu principal...");
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                            }

                                            System.out.printf("%n%n%n%n%n%n%n");
                                            break;

                                        case 1:
                                            if (formaAtual == 0) {
                                                if (!movimento) {
                                                    hibrido.iniciarMovimento();
                                                    movimento = true;
                                                } else {
                                                    System.out.println("O veículo já está em movimento!");
                                                }
                                            }
                                            if (formaAtual == 1) {
                                                if (asas && !movimento) {
                                                    hibrido.iniciarMovimento();
                                                    movimento = true;
                                                } else if (!asas) {
                                                    System.out.println("O veículo precisa ter acionado suas asas!");
                                                } else if (movimento) {
                                                    System.out.println("O veículo já está em movimento!");
                                                }
                                            }
                                            if (formaAtual == 2) {
                                                if (carcaca && ancora && !navegar && !movimento) {
                                                    hibrido.iniciarMovimento();
                                                    movimento = true;
                                                } else if (!carcaca) {
                                                    System.out.println("O veículo precisa ter acionado sua carcaça!");
                                                } else if (!ancora) {
                                                    System.out.println("O veículo precisa ter recolhido sua âncora!");
                                                } else if (navegar) {
                                                    System.out.println("O veículo já está em movimento!");
                                                } else if (movimento) {
                                                    System.out.println("O veículo já está em movimento!");
                                                }
                                            }
                                            if (formaAtual == 3) {
                                                if (!movimento && helices) {
                                                    hibrido.iniciarMovimento();
                                                    movimento = true;
                                                } else if (movimento) {
                                                    System.out.println("O veículo já está em movimento!");
                                                } else if (!helices) {
                                                    System.out.println("O veículo precisa ter acionado suas hélices!");
                                                }
                                            }
                                            break;

                                        case 2:
                                            if (movimento && !voarJato && !voarHelicoptero && !navegar) {
                                                hibrido.pararMovimento();
                                                movimento = false;
                                            } else if (navegar) {
                                                System.out.println("O veículo está navegando!");
                                            } else if (voarJato) {
                                                System.out.println("O veículo está voando!");
                                            } else if (voarHelicoptero) {
                                                System.out.println("O veículo está voando!");
                                            } else if (!movimento) {
                                                System.out.println("O veículo já está parado!");
                                            }

                                            break;

                                        case 3:
                                            if (movimento || voarHelicoptero || voarJato || navegar) {
                                                hibrido.virarParaDireita();
                                            } else {
                                                System.out.println("O veículo precisa estar em movimento!");
                                            }
                                            break;

                                        case 4:
                                            if (movimento || voarHelicoptero || voarJato || navegar) {
                                                hibrido.virarParaEsquerda();
                                            } else {
                                                System.out.println("O veículo precisa estar em movimento!");
                                            }
                                            break;

                                        case 5:
                                            switch (formaAtual) {
                                                case 0:
                                                    if (movimento) {
                                                        hibrido.trocarMarchaComoAuto();
                                                    } else {
                                                        System.out.println("O veículo precisa estar em movimento!");
                                                    }
                                                    break;
                                                case 1:
                                                    if (movimento && asas && !voarJato) {
                                                        hibrido.voarComoJato();
                                                        voarJato = true;
                                                        movimento = false;
                                                    } else if (voarJato) {
                                                        System.out.println("O veículo já está voando!");
                                                    } else if (!asas) {
                                                        System.out.println("O veículo precisa acionar as asas!");
                                                    } else if (!movimento) {
                                                        System.out.println("O veículo precisa alcançar 180km/h para decolar!");
                                                    }
                                                    break;
                                                case 2:
                                                    if (movimento && carcaca) {
                                                        hibrido.navegar();
                                                        navegar = true;
                                                        movimento = false;
                                                    } else if (!movimento) {
                                                        System.out.println("O veículo precisa estar adentrando o mar!");
                                                    } else if (!carcaca) {
                                                        System.out.println("O veículo precisa acionar a carcaça");
                                                    }
                                                    break;
                                                case 3:
                                                    if (movimento && helices && !voarJato && !navegar) {
                                                        hibrido.voarComoHelicoptero();
                                                        voarHelicoptero = true;
                                                    } else if (voarJato) {
                                                        System.out.println("O veículo está voando como Jato!");
                                                    } else if (navegar) {
                                                        System.out.println("O veículo está navegando como Lancha!");
                                                    } else if (!movimento) {
                                                        System.out.println("O veículo precisa estar em movimento!");
                                                    } else if (!helices) {
                                                        System.out.println("As hélices precisam ser acionadas!");
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }

                                            break;

                                        case 6:
                                            if (formaAtual == 0) {
                                                if (movimento) {
                                                    hibrido.andarParaTrasComoAuto();

                                                } else if (!movimento) {
                                                    System.out.println("O veículo precisa estar em movimento!");
                                                }
                                            }

                                            if (formaAtual == 1) {
                                                if (voarJato) {
                                                    hibrido.aterrissarComoJato();
                                                    voarJato = false;
                                                    movimento = true;
                                                } else {
                                                    System.out.println("O veículo precisa estar voando para aterrissar!");
                                                }
                                            }

                                            if (formaAtual == 2) {
                                                if (navegar) {
                                                    hibrido.lancarAncora();
                                                    navegar = false;
                                                } else {
                                                    System.out.println("O veículo precisa estar navegando para ancorar!");
                                                }
                                            }

                                            if (formaAtual == 3) {
                                                if (voarHelicoptero) {
                                                    hibrido.aterrissarComoHelicoptero();
                                                    voarHelicoptero = false;
                                                } else {
                                                    System.out.println("O veículo precisa estar voando para aterrissar!");
                                                }
                                            }
                                            break;

                                        case 7:

                                            if (formaAtual == 0) {
                                                if (!movimento) {
                                                    hibrido.trocarPneu();

                                                } else if (movimento) {
                                                    System.out.println("O veículo precisa estar parado!");
                                                }
                                            }

                                            if (formaAtual == 1) {
                                                if (voarJato || movimento) {
                                                    hibrido.trocarMarchaComoJato();

                                                } else {
                                                    System.out.println("O veículo precisa estar em movimento para trocar marchas!");
                                                }
                                            }

                                            if (formaAtual == 2) {
                                                if (navegar) {
                                                    hibrido.trocarMarchaComoLancha();

                                                } else {
                                                    System.out.println("O veículo precisa estar navegando para trocar marchas!");
                                                }
                                            }

                                            if (formaAtual == 3) {
                                                if (voarHelicoptero) {
                                                    hibrido.trocarMarchaComoHelicoptero();

                                                } else {
                                                    System.out.println("O veículo precisa estar voando para trocar marchas!");
                                                }
                                            }
                                            break;

                                        case 8:

                                            if (formaAtual == 0) {
                                                System.out.println("Opção desconhecida!");
                                            }

                                            if (formaAtual == 1) {
                                                if (!voarJato && !asas) {
                                                    hibrido.acionarAsas();
                                                    asas = true;

                                                } else if (voarJato) {
                                                    System.out.println("O veículo já está com as asas acionadas!");
                                                } else if (asas) {
                                                    System.out.println("O veículo já está com as asas acionadas!");
                                                }
                                            }

                                            if (formaAtual == 2) {
                                                if (navegar && carcaca) {
                                                    hibrido.andarParaTrasComoLancha();

                                                } else if (!navegar) {
                                                    System.out.println("O veículo precisa estar navegando!");
                                                } else if (!carcaca) {
                                                    System.out.println("O veículo precisa estar em ambiente aquático!");
                                                }
                                            }

                                            if (formaAtual == 3) {
                                                if (!helices && !voarHelicoptero && !movimento) {
                                                    hibrido.acionarHelices();
                                                    helices = true;

                                                } else if (helices) {
                                                    System.out.println("O veículo já está com as hélices acionadas!");
                                                } else if (voarHelicoptero) {
                                                    System.out.println("O veículo já está com as hélices acionadas!");
                                                } else if (movimento) {
                                                    System.out.println("O veículo precisa estar parado!");
                                                }
                                            }

                                            break;

                                        case 9:
                                            if (formaAtual == 0) {
                                                System.out.println("Opção desconhecida!");
                                            }

                                            if (formaAtual == 1) {
                                                if (!voarJato && asas) {
                                                    hibrido.recolherAsas();
                                                    asas = false;

                                                } else if (voarJato) {
                                                    System.out.println("O veículo precisa aterrissar para recolher as asas!");
                                                } else if (!asas) {
                                                    System.out.println("O veículo já está com as asas recolhidas!");
                                                }
                                            }

                                            if (formaAtual == 2) {
                                                if (!carcaca && !navegar && !movimento) {
                                                    hibrido.acionarCarcaca();
                                                    carcaca = true;

                                                } else if (carcaca) {
                                                    System.out.println("O veículo já está com a carcaça acionada!");
                                                } else if (navegar) {
                                                    System.out.println("O veículo já está com a carcaça acionada!");
                                                } else if (movimento) {
                                                    System.out.println("O veículo precisa estar parado!");
                                                }
                                            }

                                            if (formaAtual == 3) {
                                                if (!voarHelicoptero && helices) {
                                                    hibrido.recolherHelices();
                                                    helices = false;

                                                } else if (voarHelicoptero) {
                                                    System.out.println("O veículo precisa aterrissar para recolher as hélices!");
                                                } else if (!helices) {
                                                    System.out.println("O veículo já está com as hélices recolhidas!");
                                                }
                                            }

                                            break;

                                        case 10:
                                            if (formaAtual == 0) {
                                                System.out.println("Opção desconhecida!");
                                            }

                                            if (formaAtual == 1) {
                                                System.out.println("Opção desconhecida!");
                                            }

                                            if (formaAtual == 2) {
                                                if (!navegar && carcaca) {
                                                    hibrido.recolherCarcaca();
                                                    carcaca = false;

                                                } else if (navegar) {
                                                    System.out.println("O veículo precisa estar em terra firme!");
                                                } else if (!carcaca) {
                                                    System.out.println("O veículo já está com a carcaça recolhida!");
                                                }
                                            }

                                            if (formaAtual == 3) {
                                                System.out.println("Opção desconhecida!");
                                            }

                                            break;
                                        case 11:
                                            if (!navegar && !ancora && carcaca) {
                                                hibrido.recolherAncora();
                                                ancora = true;

                                            } else if (navegar) {
                                                System.out.println("O veículo já está navegando!");
                                            } else if (ancora) {
                                                System.out.println("O veículo está ancorado!");
                                            } else if (!carcaca) {
                                                System.out.println("O veículo precisa ter acionado sua carcaça!");
                                            }
                                            ;
                                    }

                                }

                            } while (aux2 != 0);

                            break;

                        case 2:

                            String option3;
                            int aux3 = 0;
                            boolean numero3;

                            System.out.println("1 - Automóvel");
                            System.out.println("2 - Jato");
                            System.out.println("3 - Lancha");
                            System.out.println("4 - Helicóptero");

                            System.out.println("");
                            System.out.print("Informe a opção: ");
                            option3 = entrada.next();
                            System.out.println("");

                            try {
                                aux3 = Integer.parseInt(option3);
                                numero3 = true;
                            } catch (NumberFormatException e) {
                                numero3 = false;
                            }

                            if (numero3) {

                                switch (aux3) {
                                    case 1:
                                        System.out.println("");
                                        System.out.println("Iniciando Transformação...");
                                        System.out.println("");
                                        formaAtual = 0;
                                        hibrido.setEtapaAtual(0);
                                        break;

                                    case 2:

                                        System.out.println("Iniciando Transformação...");
                                        System.out.println("");
                                        formaAtual = 1;
                                        hibrido.setEtapaAtual(1);
                                        break;

                                    case 3:

                                        System.out.println("Iniciando Transformação...");
                                        System.out.println("");
                                        formaAtual = 2;
                                        hibrido.setEtapaAtual(2);
                                        break;

                                    case 4:

                                        System.out.println("Iniciando Transformação...");
                                        System.out.println("");
                                        formaAtual = 3;
                                        hibrido.setEtapaAtual(3);
                                        break;
                                }
                            } else {
                                System.out.println("Opção inválida!");
                            }
                            break;

                        case 3:

                            String option4;
                            int aux4 = 0;
                            boolean numero4;

                            do {
                                System.out.println("");
                                System.out.println("0 - Retornar ao menu principal");
                                System.out.println("1 - Importar carros híbridos");
                                System.out.println("2 - Exportar carros híbridos");
                                System.out.println("3 - Novo cadastro");
                                System.out.println("4 - Mostrar dados veículos");

                                System.out.println("");
                                System.out.print("Informe a opção: ");
                                option4 = entrada.next();
                                System.out.println("");

                                try {
                                    aux4 = Integer.parseInt(option4);
                                    numero4 = true;
                                } catch (NumberFormatException e) {
                                    numero4 = false;
                                }

                                if (numero4) {

                                    switch (aux4) {

                                        case 0:
                                            System.out.println("Retornando ao menu principal...");
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                            }
                                            break;

                                        case 1:
                                            mont.importarCarrosHibridos();
                                            break;

                                        case 2:
                                            mont.exportarCarrosHibridos();
                                            break;

                                        case 3:   
                                            System.out.println("---NOVO CADASTRO=---");
                                            System.out.println();
                                            System.out.println("Digite o nome do proprietário: ");
                                            String nomeProp = entrada.next();
                                            System.out.println("Digite o nome do veículo: ");
                                            String nomevei = entrada.next();
                                            System.out.println("Digite o fabricante do veículo: ");
                                            String fabricante = entrada.next();
                                            System.out.println("Digite o tipo do combustível: ");
                                            String combustivel = entrada.next();
                                            System.out.println("Digite a cor do veículo: ");
                                            String cor = entrada.next();
                                            System.out.println("Digite o ano de fabricação do veículo: ");
                                            int ano = entrada.nextInt();
                                            Hibrido hibrid = new Hibrido(nomeProp, nomevei, fabricante, cor, combustivel, ano);
                                            mont.adicionarVeiculos(hibrid);
                                            mont.exportarCarrosHibridos();                                        
                                            break;    
                                        case 4:

                                            mont.mostrarDadosVeiculos();
                                            if (mont.vazio) {
                                                System.out.println("Lista vazia...");
                                            }
                                            if (formaAtual == 0) {
                                                hibrido.setEtapaAtual(0);
                                                hibrido.mostrarDadosAuto();
                                            }
                                            if (formaAtual == 1) {
                                                hibrido.setEtapaAtual(1);
                                                hibrido.mostrarDadosJato();
                                            }
                                            if (formaAtual == 2) {
                                                hibrido.setEtapaAtual(2);
                                                hibrido.mostrarDadosLancha();
                                            }
                                            if (formaAtual == 3) {
                                                hibrido.setEtapaAtual(3);
                                                hibrido.mostrarDadosHelicoptero();
                                            }
                                            break;

                                        default:
                                            System.out.println("Opção inválida!");
                                            System.out.println("");
                                            break;

                                    }
                                } else {
                                    System.out.println("Opção inválida!");
                                }

                            } while (aux4 != 0);
                    }
                } else {
                    System.out.println("Opção inválida!");
                }

            } while (aux1 != 9);
        } catch (InputMismatchException e) {
            System.out.println("Valor repassado para o ano não é um inteiro válido. Veículo será desligado automaticamente!");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Nenhum valor foi digitado. Veículo será desligado automaticamente!");
        } catch (FileNotFoundException e2){
            System.out.println("Arquivo.txt não encontrado. Veículo será desligado automaticamente!");
        } catch (Exception e3){
            System.out.println("Erro geral. Seu veículo será desligado automaticamente. Informe o suporte!");
        }
    }

}

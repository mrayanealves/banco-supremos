/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.controles.ControleCliente;
import br.com.controles.ControleFuncionario;
import br.com.controles.ControleGerente;
import br.com.models.Cliente;
import br.com.models.Funcionario;
import br.com.telas.Deposito;
import br.com.telas.Extrato;
import br.com.telas.Saque;
import br.com.telas.Transferencia;
import br.com.auxilio.LimparCampos;
import br.com.validacoes.ValidacoesCliente;
import br.com.validacoes.ValidacoesConta;
import br.com.validacoes.ValidacoesFuncionario;
import br.com.verificacao.VerificacaoLogin;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayane
 */
@SuppressWarnings("serial")
public class BancoSupremoApplication extends javax.swing.JFrame {
	boolean gerenteLogado;
    int func_logado;
    private Saque telaSaque;
    private Deposito telaDeposito;
    private Transferencia telaTrans;
    private Extrato telaExtrato;
    
    public BancoSupremoApplication() {
        setResizable(false);
        initComponents();
        gerenteLogado = false;
        func_logado = 0;
        
        setLocationRelativeTo(null);
    }

    public void mostrarPainel(String painel) {
        CardLayout layout = (CardLayout) painelPrincipal.getLayout();
        layout.show(painelPrincipal, painel);
        campoValorBonificacao.setEditable(false);
    }

    private void initComponents() {
        sexo = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        painelInicial = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        botaoEntrarLogin = new javax.swing.JToggleButton();
        jLabel33 = new javax.swing.JLabel();
        painelLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        painelMenuGerente = new javax.swing.JPanel();
        cadastrarNovaConta = new javax.swing.JButton();
        realizarOperacoes = new javax.swing.JButton();
        cadastrarFuncionario = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        botaoAtualizarFuncionario = new javax.swing.JButton();
        botaoAtualizarCliente2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        painelMenuFuncionario = new javax.swing.JPanel();
        botaoCadastrarNovaConta = new javax.swing.JButton();
        botaoAtualizarCliente = new javax.swing.JButton();
        botaoRealizarOperacoes = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        painelCadastrarFuncionario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radioFeminino = new javax.swing.JRadioButton();
        radioMasculino = new javax.swing.JRadioButton();
        radioGerente = new javax.swing.JRadioButton();
        campoNomeFuncionario = new javax.swing.JTextField();
        campoEnderecoFuncionario = new javax.swing.JTextField();
        campoCpfFuncionario = new javax.swing.JFormattedTextField();
        campoCargaHFuncionario = new javax.swing.JTextField();
        campoLoginFuncionario = new javax.swing.JTextField();
        campoSenhaFuncionario = new javax.swing.JPasswordField();
        botaoCadastrarFuncionario = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        campoValorBonificacao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        botaoVoltarCadastroFuncionario = new javax.swing.JButton();
        campoSalarioFuncionario = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        painelCadastroCliente = new javax.swing.JPanel();
        nomeCliente = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        cpfCliente = new javax.swing.JLabel();
        campoCpfCliente = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        campoEnderecoCliente = new javax.swing.JTextField();
        botaoCadastrarCliente = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        radioFemininoCliente = new javax.swing.JRadioButton();
        radioMasculinoCliente = new javax.swing.JRadioButton();
        botaoVoltarCadastrarCliente = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        painelCadastroConta = new javax.swing.JPanel();
        cadastrarCliente = new javax.swing.JButton();
        campoCpfClienteConta = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        campoSenhaConta = new javax.swing.JPasswordField();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltarNovaConta = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        painelMenuOperacoes = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        painelVizualizarFuncionario = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        radioFeminino1 = new javax.swing.JRadioButton();
        radioMasculino1 = new javax.swing.JRadioButton();
        campoNomeFuncionario1 = new javax.swing.JTextField();
        campoEnderecoFuncionario1 = new javax.swing.JTextField();
        campoCargaHFuncionario1 = new javax.swing.JTextField();
        campoLoginFuncionario1 = new javax.swing.JTextField();
        botaoDeletarFuncionario = new javax.swing.JButton();
        campoSalarioFuncionario1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        campoCodFuncionario = new javax.swing.JTextField();
        botaoAlterarFuncionario = new javax.swing.JButton();
        campoCpfFuncionario1 = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        botaoVoltarVizualizacaoFuncionario = new javax.swing.JButton();
        painelVizualizarCliente = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        nomeCliente1 = new javax.swing.JLabel();
        campoNomeCliente1 = new javax.swing.JTextField();
        cpfCliente1 = new javax.swing.JLabel();
        campoCpfCliente1 = new javax.swing.JFormattedTextField();
        jLabel45 = new javax.swing.JLabel();
        campoEnderecoCliente1 = new javax.swing.JTextField();
        radioFemininoCliente1 = new javax.swing.JRadioButton();
        radioMasculinoCliente1 = new javax.swing.JRadioButton();
        botaoAlterarCliente = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        botaoBuscarCliente = new javax.swing.JButton();
        botaoVoltarVizualizarCliente = new javax.swing.JButton();
        campoCpfClienteBuscar = new javax.swing.JFormattedTextField();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Supremos");
        setResizable(false);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        painelInicial.setBackground(java.awt.Color.white);
        painelInicial.setMaximumSize(new java.awt.Dimension(706, 529));
        painelInicial.setMinimumSize(new java.awt.Dimension(706, 529));
        painelInicial.setPreferredSize(new java.awt.Dimension(706, 529));
        painelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo/Logo Preta.png"))); // NOI18N
        painelInicial.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 122, 576, 202));

        botaoEntrarLogin.setBackground(new java.awt.Color(0, 0, 0));
        botaoEntrarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Entrar.png"))); // NOI18N
        botaoEntrarLogin.setBorder(null);
        botaoEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarLoginActionPerformed(evt);
            }
        });
        painelInicial.add(botaoEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 83, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/slogan.png"))); // NOI18N
        painelInicial.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 315, 460, 40));

        painelPrincipal.add(painelInicial, "painelInicial");

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));
        painelLogin.setMaximumSize(new java.awt.Dimension(706, 529));
        painelLogin.setMinimumSize(new java.awt.Dimension(706, 529));
        painelLogin.setPreferredSize(new java.awt.Dimension(706, 529));

        labelLogin.setText("Digite seu login:");

        labelSenha.setText("Digite sua senha:");

        botaoEntrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Entrar.png"))); // NOI18N
        botaoEntrar.setBorder(null);
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo/Logo Preta.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/slogan.png"))); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel34))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(63, 63, 63))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel34))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(botaoEntrar))
        );

        painelPrincipal.add(painelLogin, "painelLogin");

        painelMenuGerente.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuGerente.setMaximumSize(new java.awt.Dimension(706, 529));
        painelMenuGerente.setMinimumSize(new java.awt.Dimension(706, 529));
        painelMenuGerente.setPreferredSize(new java.awt.Dimension(706, 529));
        painelMenuGerente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarNovaConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoCadastrarNovaConta.png"))); // NOI18N
        cadastrarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovaContaActionPerformed(evt);
            }
        });
        painelMenuGerente.add(cadastrarNovaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 180, 70));

        realizarOperacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoRealizarOpera��es.png"))); // NOI18N
        realizarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarOperacoesActionPerformed(evt);
            }
        });
        painelMenuGerente.add(realizarOperacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, 70));

        cadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoCadastrarFuncionário.png"))); // NOI18N
        cadastrarFuncionario.setBorder(null);
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        painelMenuGerente.add(cadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 170, 70));

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/sair.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        painelMenuGerente.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 120, 50));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialLogin.png"))); // NOI18N
        painelMenuGerente.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 0, 740, 80));

        botaoAtualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoVisualizarFuncionario.png"))); // NOI18N
        botaoAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarFuncionarioActionPerformed(evt);
            }
        });
        painelMenuGerente.add(botaoAtualizarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 70));

        botaoAtualizarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoVisualizarCliente.png"))); // NOI18N
        botaoAtualizarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarCliente2ActionPerformed(evt);
            }
        });
        painelMenuGerente.add(botaoAtualizarCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 170, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N
        painelMenuGerente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 710, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/palavraMenu.png"))); // NOI18N
        painelMenuGerente.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 320, -1));

        painelPrincipal.add(painelMenuGerente, "painelMenuGerente");

        painelMenuFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuFuncionario.setMaximumSize(new java.awt.Dimension(706, 529));
        painelMenuFuncionario.setMinimumSize(new java.awt.Dimension(706, 529));
        painelMenuFuncionario.setPreferredSize(new java.awt.Dimension(706, 529));
        painelMenuFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCadastrarNovaConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoCadastrarNovaConta.png"))); // NOI18N
        botaoCadastrarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarNovaContaActionPerformed(evt);
            }
        });
        painelMenuFuncionario.add(botaoCadastrarNovaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 234, 183, 70));

        botaoAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/atualizarCliente.png"))); // NOI18N
        botaoAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarClienteActionPerformed(evt);
            }
        });
        painelMenuFuncionario.add(botaoAtualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 183, 74));

        botaoRealizarOperacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoRealizarOperações.png"))); // NOI18N
        painelMenuFuncionario.add(botaoRealizarOperacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 234, 170, 70));

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/sair.png"))); // NOI18N
        painelMenuFuncionario.add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 141, 58));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialLogin.png"))); // NOI18N
        painelMenuFuncionario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 75));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N
        painelMenuFuncionario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 710, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/palavraMenu.png"))); // NOI18N
        painelMenuFuncionario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        painelPrincipal.add(painelMenuFuncionario, "painelMenuFuncionario");

        painelCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastrarFuncionario.setMaximumSize(new java.awt.Dimension(706, 529));
        painelCadastrarFuncionario.setMinimumSize(new java.awt.Dimension(706, 529));
        painelCadastrarFuncionario.setPreferredSize(new java.awt.Dimension(706, 529));

        jLabel2.setText("* Nome: ");

        jLabel3.setText("* Endereço:");

        jLabel4.setText("* CPF:");

        jLabel8.setText("*$ Salário: ");

        jLabel9.setText("*$ Carga Horária:");

        jLabel10.setText("* Login:");

        jLabel11.setText("* Senha:");

        sexo.add(radioFeminino);
        radioFeminino.setText("Feminino");

        sexo.add(radioMasculino);
        radioMasculino.setText("Masculino");

        radioGerente.setText("Gerente");
        radioGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioGerenteMouseClicked(evt);
            }
        });

        try {
            campoCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoCargaHFuncionario.setToolTipText("");

        botaoCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Cadastrar.png"))); // NOI18N
        botaoCadastrarFuncionario.setBorder(null);
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor bonificação:");

        campoValorBonificacao.setEditable(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialnovoFuncionario.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/preenchaCampos.png"))); // NOI18N

        botaoVoltarCadastroFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        botaoVoltarCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Voltar.png"))); // NOI18N
        botaoVoltarCadastroFuncionario.setBorder(null);
        botaoVoltarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarCadastroFuncionarioActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel46.setText("* Campos obrigatórios ");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel50.setText("$ Apenas números");

        javax.swing.GroupLayout painelCadastrarFuncionarioLayout = new javax.swing.GroupLayout(painelCadastrarFuncionario);
        painelCadastrarFuncionario.setLayout(painelCadastrarFuncionarioLayout);
        painelCadastrarFuncionarioLayout.setHorizontalGroup(
            painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel50)
                        .addComponent(jLabel46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(radioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoValorBonificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(200, 200, 200))
                                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(campoLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(63, 63, 63)
                                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                        .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoCargaHFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                        .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addComponent(botaoVoltarCadastroFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrarFuncionario)
                        .addGap(33, 33, 33))))
        );
        painelCadastrarFuncionarioLayout.setVerticalGroup(
            painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(campoEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(campoSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCargaHFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(campoSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(campoValorBonificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(painelCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarCadastroFuncionario))
                .addGap(56, 56, 56))
        );

        painelPrincipal.add(painelCadastrarFuncionario, "painelCadastrarFuncionario");

        painelCadastroCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastroCliente.setMaximumSize(new java.awt.Dimension(706, 529));
        painelCadastroCliente.setMinimumSize(new java.awt.Dimension(706, 529));
        painelCadastroCliente.setPreferredSize(new java.awt.Dimension(706, 529));

        nomeCliente.setText("* Nome:");

        cpfCliente.setText("* CPF:");

        try {
            campoCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("* Endereço:");

        botaoCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Cadastrar.png"))); // NOI18N
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialnovoCliente.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/preenchaCampos.png"))); // NOI18N

        sexo.add(radioFemininoCliente);
        radioFemininoCliente.setText("Feminino");

        sexo.add(radioMasculinoCliente);
        radioMasculinoCliente.setText("Masculino");

        botaoVoltarCadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        botaoVoltarCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Voltar.png"))); // NOI18N
        botaoVoltarCadastrarCliente.setBorder(null);
        botaoVoltarCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarCadastrarClienteActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel47.setText("* Campos obrigatórios");

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroClienteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                    .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))
                            .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoEnderecoCliente)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioFemininoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioMasculinoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47))
                        .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(botaoVoltarCadastrarCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel22)
                                .addComponent(jLabel47))))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(38, 38, 38)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculinoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFemininoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCliente))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltarCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrincipal.add(painelCadastroCliente, "painelCadastroCliente");

        painelCadastroConta.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastroConta.setMaximumSize(new java.awt.Dimension(706, 529));
        painelCadastroConta.setMinimumSize(new java.awt.Dimension(706, 529));
        painelCadastroConta.setPreferredSize(new java.awt.Dimension(706, 529));

        cadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/No Cliente.png"))); // NOI18N
        cadastrarCliente.setBorder(null);
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        try {
            campoCpfClienteConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialnovaConta.png"))); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/preenchaCampos.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N

        jLabel35.setText("*CPF do Cliente: ");

        jLabel36.setText("*Senha para a conta: ");

        botaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Cadastrar.png"))); // NOI18N
        botaoCadastrar.setBorder(null);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoVoltarNovaConta.setBackground(new java.awt.Color(255, 255, 255));
        botaoVoltarNovaConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Voltar.png"))); // NOI18N
        botaoVoltarNovaConta.setBorder(null);
        botaoVoltarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarNovaContaActionPerformed(evt);
            }
        });

        jLabel51.setText("* Campos obrigatórios");

        javax.swing.GroupLayout painelCadastroContaLayout = new javax.swing.GroupLayout(painelCadastroConta);
        painelCadastroConta.setLayout(painelCadastroContaLayout);
        painelCadastroContaLayout.setHorizontalGroup(
            painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroContaLayout.createSequentialGroup()
                .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(painelCadastroContaLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelCadastroContaLayout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoSenhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelCadastroContaLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoCpfClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cadastrarCliente))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroContaLayout.createSequentialGroup()
                                    .addComponent(botaoVoltarNovaConta)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoCadastrar)))
                            .addComponent(jLabel28)
                            .addComponent(jLabel51))))
                .addGap(4, 4, 4))
        );
        painelCadastroContaLayout.setVerticalGroup(
            painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroContaLayout.createSequentialGroup()
                .addComponent(jLabel27)
                .addGap(32, 32, 32)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(26, 26, 26)
                .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroContaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel35))
                    .addComponent(campoCpfClienteConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(campoSenhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(painelCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarNovaConta))
                .addGap(41, 41, 41)
                .addComponent(jLabel7))
        );

        painelPrincipal.add(painelCadastroConta, "painelCadastroConta");

        painelMenuOperacoes.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuOperacoes.setMaximumSize(new java.awt.Dimension(706, 529));
        painelMenuOperacoes.setMinimumSize(new java.awt.Dimension(706, 529));
        painelMenuOperacoes.setPreferredSize(new java.awt.Dimension(706, 529));
        painelMenuOperacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Saque2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelMenuOperacoes.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Depósito2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        painelMenuOperacoes.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 190, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Transferência2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        painelMenuOperacoes.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 210, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/extrato2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelMenuOperacoes.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 190, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/cancelar.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        painelMenuOperacoes.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 190, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialOperacoes.png"))); // NOI18N
        painelMenuOperacoes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/palavraMenu.png"))); // NOI18N
        painelMenuOperacoes.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N
        painelMenuOperacoes.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 720, -1));

        painelPrincipal.add(painelMenuOperacoes, "painelMenuOperacoes");

        painelVizualizarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelVizualizarFuncionario.setMinimumSize(new java.awt.Dimension(706, 529));
        painelVizualizarFuncionario.setPreferredSize(new java.awt.Dimension(706, 529));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialVisualizarFuncionario.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N

        jLabel39.setText("Nome: ");

        jLabel40.setText("Endereço:");

        jLabel41.setText("CPF:");

        jLabel42.setText("Salário: ");

        jLabel43.setText("Carga Horária:");

        jLabel44.setText("Login:");

        sexo.add(radioFeminino1);
        radioFeminino1.setText("Feminino");
        radioFeminino1.setEnabled(false);

        sexo.add(radioMasculino1);
        radioMasculino1.setText("Masculino");
        radioMasculino1.setEnabled(false);

        campoCargaHFuncionario1.setToolTipText("");

        botaoDeletarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        botaoDeletarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Deletar.png"))); // NOI18N
        botaoDeletarFuncionario.setBorder(null);
        botaoDeletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarFuncionarioActionPerformed(evt);
            }
        });

        jLabel48.setText("Digite o código do funcionário:");

        botaoAlterarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        botaoAlterarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Alterar.png"))); // NOI18N
        botaoAlterarFuncionario.setBorder(null);
        botaoAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarFuncionarioActionPerformed(evt);
            }
        });

        campoCpfFuncionario1.setEditable(false);

        botaoBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoBuscar.png"))); // NOI18N
        botaoBuscar.setBorder(null);
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        botaoVoltarVizualizacaoFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        botaoVoltarVizualizacaoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Voltar.png"))); // NOI18N
        botaoVoltarVizualizacaoFuncionario.setBorder(null);
        botaoVoltarVizualizacaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarVizualizacaoFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVizualizarFuncionarioLayout = new javax.swing.GroupLayout(painelVizualizarFuncionario);
        painelVizualizarFuncionario.setLayout(painelVizualizarFuncionarioLayout);
        painelVizualizarFuncionarioLayout.setHorizontalGroup(
            painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel48)
                .addGap(25, 25, 25)
                .addComponent(campoCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel39)
                .addGap(26, 26, 26)
                .addComponent(campoNomeFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel44))
            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addComponent(botaoAlterarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoDeletarFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltarVizualizacaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(37, 37, 37)))
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addComponent(campoCpfFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(radioFeminino1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioMasculino1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoEnderecoFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addComponent(campoSalarioFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43)
                                .addGap(32, 32, 32)
                                .addComponent(campoCargaHFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addComponent(campoLoginFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        painelVizualizarFuncionarioLayout.setVerticalGroup(
            painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(12, 12, 12)
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(campoCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(campoNomeFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(campoEnderecoFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMasculino1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(campoCpfFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFeminino1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(campoCargaHFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(campoSalarioFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelVizualizarFuncionarioLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel43)))
                        .addGap(18, 18, 18)
                        .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(campoLoginFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(painelVizualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoDeletarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botaoAlterarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarVizualizacaoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel32))
        );

        painelPrincipal.add(painelVizualizarFuncionario, "painelVizualizarFuncionario");

        painelVizualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelVizualizarCliente.setMaximumSize(new java.awt.Dimension(706, 529));
        painelVizualizarCliente.setPreferredSize(new java.awt.Dimension(706, 529));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialVisualizarCliente.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N

        nomeCliente1.setText("Nome:");

        cpfCliente1.setText("CPF:");

        campoCpfCliente1.setEditable(false);
        try {
            campoCpfCliente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel45.setText("Endereço:");

        sexo.add(radioFemininoCliente1);
        radioFemininoCliente1.setText("Feminino");
        radioFemininoCliente1.setEnabled(false);

        sexo.add(radioMasculinoCliente1);
        radioMasculinoCliente1.setText("Masculino");
        radioMasculinoCliente1.setEnabled(false);

        botaoAlterarCliente.setBackground(new java.awt.Color(255, 255, 255));
        botaoAlterarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Alterar.png"))); // NOI18N
        botaoAlterarCliente.setBorder(null);
        botaoAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarClienteActionPerformed(evt);
            }
        });

        jLabel49.setText("Digite o CPF do cliente:");

        botaoBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        botaoBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/botaoBuscar.png"))); // NOI18N
        botaoBuscarCliente.setBorder(null);
        botaoBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarClienteActionPerformed(evt);
            }
        });

        botaoVoltarVizualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        botaoVoltarVizualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Voltar.png"))); // NOI18N
        botaoVoltarVizualizarCliente.setBorder(null);
        botaoVoltarVizualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarVizualizarClienteActionPerformed(evt);
            }
        });

        try {
            campoCpfClienteBuscar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelVizualizarClienteLayout = new javax.swing.GroupLayout(painelVizualizarCliente);
        painelVizualizarCliente.setLayout(painelVizualizarClienteLayout);
        painelVizualizarClienteLayout.setHorizontalGroup(
            painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVizualizarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAlterarCliente)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltarVizualizarCliente)
                .addGap(75, 75, 75))
            .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(37, 37, 37)
                        .addComponent(campoCpfClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addComponent(nomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(campoNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addComponent(cpfCliente1)
                        .addGap(17, 17, 17)
                        .addComponent(campoCpfCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(radioFemininoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(radioMasculinoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(11, 11, 11)
                        .addComponent(campoEnderecoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelVizualizarClienteLayout.setVerticalGroup(
            painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                .addComponent(jLabel37)
                .addGap(35, 35, 35)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(campoCpfClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCliente1)
                    .addComponent(campoNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioFemininoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMasculinoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelVizualizarClienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfCliente1)
                            .addComponent(campoCpfCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(campoEnderecoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(painelVizualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarVizualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel38))
        );

        painelPrincipal.add(painelVizualizarCliente, "painelVizualizarCliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelPrincipal.getAccessibleContext().setAccessibleName("painelPrincipal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        VerificacaoLogin lo = new VerificacaoLogin();
        LimparCampos l = new LimparCampos();
        boolean logado = false;

        String login = campoLogin.getText();
        String senha = campoSenha.getText();

        logado = lo.verificarLogin(login, senha);
        if (logado == true) {
            ControleGerente g = new ControleGerente();
            ControleFuncionario c = new ControleFuncionario();
            func_logado = c.recuperarCodLogado(login);
            gerenteLogado = g.ehGerente(func_logado);

            if (gerenteLogado == true) {
                mostrarPainel("painelMenuGerente");
            } else {
                mostrarPainel("painelMenuGerente");
                botaoCadastrarFuncionario.setEnabled(false);
                botaoAtualizarFuncionario.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login Inválido");
        }
        l.limparCamposDeTexto(campoLogin);
        l.limparCamposDeSenha(campoSenha);
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void cadastrarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovaContaActionPerformed
        mostrarPainel("painelCadastroConta");
    }//GEN-LAST:event_cadastrarNovaContaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        mostrarPainel("painelInicial");
    }//GEN-LAST:event_sairActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        mostrarPainel("painelCadastrarFuncionario");
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        mostrarPainel("painelCadastroCliente");
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        ValidacoesCliente c = new ValidacoesCliente();
        LimparCampos l = new LimparCampos();

        String cpf = campoCpfCliente.getText();
        String endereco = campoEnderecoCliente.getText();
        String nome = campoNomeCliente.getText();
        String s = "";

        if (radioFemininoCliente.isSelected()) {
            s = "F";
        } else if (radioMasculinoCliente.isSelected()) {
            s = "M";
        }

        boolean valido = c.verificarCamposCadastro(campoNomeCliente, campoEnderecoCliente, campoCpfCliente);
        if (valido == true) {
            c.cadastrarCliente(cpf, nome, endereco, s);
            mostrarPainel("painelCadastroConta");

            l.limparCamposDeTexto(campoNomeCliente, campoCpfCliente, campoEnderecoCliente);
            l.desmarcarGrudoDeBotao(sexo);
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios!");
        }
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void realizarOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarOperacoesActionPerformed
        mostrarPainel("painelMenuOperacoes");
    }//GEN-LAST:event_realizarOperacoesActionPerformed

    private void botaoEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarLoginActionPerformed
        mostrarPainel("painelLogin");
    }//GEN-LAST:event_botaoEntrarLoginActionPerformed

    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        ValidacoesFuncionario v = new ValidacoesFuncionario();
        LimparCampos l = new LimparCampos();
        String cpf = campoCpfFuncionario.getText();
        String nome = campoNomeFuncionario.getText();
        String endereco = campoEnderecoFuncionario.getText();
        String s = "";

        if (radioFeminino.isSelected()) {
            s = "F";
        } else if (radioMasculino.isSelected()) {
            s = "M";
        }

        String salario = campoSalarioFuncionario.getText();
        String cargaH = campoCargaHFuncionario.getText();
        String login = campoLoginFuncionario.getText();
        String senha = campoSenhaFuncionario.getText();
        String valor = campoValorBonificacao.getText();
        boolean gerente = false;

        if (radioGerente.isSelected()) {
            gerente = true;
        }
        boolean valido = v.validarCamposCadastro(campoNomeFuncionario, campoEnderecoFuncionario, campoSalarioFuncionario, campoCargaHFuncionario, campoLoginFuncionario, campoSenhaFuncionario, campoCpfFuncionario);
        if (valido == true) {
            v.cadastrarFuncionario(cpf, nome, endereco, s, salario, cargaH, login, senha, login, gerente);
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios!");
        }

        l.limparCamposDeTexto(campoNomeFuncionario, campoEnderecoFuncionario, campoSalarioFuncionario,
                campoCargaHFuncionario, campoLoginFuncionario, campoValorBonificacao);
        l.limparCamposDeSenha(campoSenhaFuncionario);
        l.limparCamposFormatados(campoCpfFuncionario);
        l.desmarcarRadios(radioGerente);
        l.desmarcarGrudoDeBotao(sexo);
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    private void radioGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioGerenteMouseClicked
        if (campoValorBonificacao.isEditable()) {
            campoValorBonificacao.setEditable(false);
            campoValorBonificacao.setText("");
        } else {
            campoValorBonificacao.setEditable(true);
        }
    }//GEN-LAST:event_radioGerenteMouseClicked

    private void botaoAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarFuncionarioActionPerformed
        mostrarPainel("painelVizualizarFuncionario");
    }//GEN-LAST:event_botaoAtualizarFuncionarioActionPerformed

    private void botaoCadastrarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarNovaContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarNovaContaActionPerformed

    private void botaoAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAtualizarClienteActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        ValidacoesConta c = new ValidacoesConta();
        LimparCampos l = new LimparCampos();
        boolean preenchido = c.validarCamposCadastro(campoCpfClienteConta, campoSenhaConta);
        
        if (preenchido = true) {
            c.cadastrarConta(campoCpfClienteConta, campoSenhaConta);
            if (gerenteLogado == true) {
                mostrarPainel("painelMenuGerente");
            } else {
                mostrarPainel("painelMenuFuncionario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios!");
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoDeletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarFuncionarioActionPerformed
        ValidacoesFuncionario c = new ValidacoesFuncionario();
        LimparCampos l = new LimparCampos();
        boolean preencido = false;
        String cod = campoCodFuncionario.getText();

        preencido = c.validarCamposCodigo(campoCodFuncionario);
        if (preencido == true) {
            c.deletarFuncionario(cod);
        } else {
            JOptionPane.showMessageDialog(null, "Digite o código do funcionário que deseja deletar!");
        }
        l.desmarcarGrudoDeBotao(sexo);
        l.limparCamposDeTexto(campoCodFuncionario, campoNomeFuncionario1, campoEnderecoFuncionario1, campoCpfFuncionario1,
                campoSalarioFuncionario1, campoCargaHFuncionario1, campoLoginFuncionario1);
    }//GEN-LAST:event_botaoDeletarFuncionarioActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        ValidacoesFuncionario c = new ValidacoesFuncionario();
        LimparCampos l = new LimparCampos();
        boolean preenchido = false;

        preenchido = c.validarCamposCodigo(campoCodFuncionario);
        if (preenchido == true) {
            ControleFuncionario cc = new ControleFuncionario();
            boolean existe = false;
            existe = cc.existeCodFuncionario(campoCodFuncionario.getText());

            if (existe == true) {
                Funcionario f = new Funcionario();

                f = c.buscarFuncionario(campoCodFuncionario);
                campoNomeFuncionario1.setText(f.getNome());
                campoCpfFuncionario1.setText(f.getCpf_funcionario());
                campoEnderecoFuncionario1.setText(f.getEndereco());
                campoSalarioFuncionario1.setText(f.getSalario() + "");
                String carga = f.getCargaH() + "";
                campoCargaHFuncionario1.setText(carga);
                campoLoginFuncionario1.setText(f.getLogin());

                if (f.getSexo().equals("F")) {
                    radioFeminino1.setSelected(true);
                } else if (f.getSexo().equals("M")) {
                    radioMasculino1.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado!\nVerifique se o "
                        + "código foi digitado corretamente e tente novamente.");
                l.limparCamposDeTexto(campoCodFuncionario);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Digite o código do funcionário que deseja buscar!");
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarFuncionarioActionPerformed
        ValidacoesFuncionario c = new ValidacoesFuncionario();
        LimparCampos l = new LimparCampos();

        String nome = campoNomeFuncionario1.getText();
        String endereco = campoEnderecoFuncionario1.getText();
        String salario = campoSalarioFuncionario1.getText();
        String cargaH = campoCargaHFuncionario1.getText();
        String cod = campoCodFuncionario.getText();
        boolean vazio = false;

        c.validarCamposCodigo(campoCodFuncionario);

        if (vazio == false) {
            c.atualizarFuncionario(cod, nome, endereco, salario, cargaH);
        } else {
            JOptionPane.showMessageDialog(null, "Digite o código do funcionário que deseja atulizar!");
        }
        l.desmarcarGrudoDeBotao(sexo);
        l.limparCamposDeTexto(campoCodFuncionario, campoNomeFuncionario1, campoEnderecoFuncionario1, campoCpfFuncionario1,
                campoSalarioFuncionario1, campoCargaHFuncionario1, campoLoginFuncionario1);
    }//GEN-LAST:event_botaoAlterarFuncionarioActionPerformed

    private void botaoBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarClienteActionPerformed
        ValidacoesCliente v = new ValidacoesCliente();
        LimparCampos l = new LimparCampos();
        boolean vazio = false;

        vazio = v.verificarCampoCpf(campoCpfClienteBuscar);
        if (vazio == false) {
            ControleCliente cc = new ControleCliente();
            boolean existe;

            existe = cc.existeCliente(campoCpfClienteBuscar.getText());

            if (existe == true) {
                ControleCliente cli = new ControleCliente();
                Cliente c = null;
                String cpf = campoCpfClienteBuscar.getText();

                c = cli.encontrarCliente(cpf);

                campoNomeCliente1.setText(c.getNome());
                campoCpfCliente1.setText(c.getCpf_cliente());
                campoEnderecoCliente1.setText(c.getEndereco());

                if (c.getSexo().equals("F")) {
                    radioFemininoCliente1.setSelected(true);
                } else if (c.getSexo().equals("M")) {
                    radioMasculinoCliente1.setSelected(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!\nVerifique se o CPF foi digitado corretamente e tente novamente!");
                l.limparCamposFormatados(campoCpfClienteBuscar);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Digite o CPF do cliente que deseja buscar!");
        }
    }//GEN-LAST:event_botaoBuscarClienteActionPerformed

    private void botaoAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarClienteActionPerformed
        ValidacoesCliente c = new ValidacoesCliente();
        LimparCampos l = new LimparCampos();
        boolean preenchido = false;

        String nome = campoNomeCliente1.getText();
        String endereco = campoEnderecoCliente1.getText();
        String cpf = campoCpfClienteBuscar.getText();

        preenchido = c.verificarCampoCpf(campoCpfCliente);
        if (preenchido == true) {
            c.atualizarCiente(nome, endereco, cpf);
        } else {
            JOptionPane.showMessageDialog(null, "Digite o CPF do cliente que deseja atulizar!");
        }
        l.limparCamposFormatados(campoCpfClienteBuscar);
        l.limparCamposDeTexto(campoNomeCliente1, campoCpfCliente1, campoEnderecoCliente1);
        l.desmarcarGrudoDeBotao(sexo);
    }//GEN-LAST:event_botaoAlterarClienteActionPerformed

    private void botaoAtualizarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarCliente2ActionPerformed
        mostrarPainel("painelVizualizarCliente");
    }//GEN-LAST:event_botaoAtualizarCliente2ActionPerformed

    private void botaoVoltarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarCadastroFuncionarioActionPerformed
        LimparCampos l = new LimparCampos();
        mostrarPainel("painelMenuGerente");

        l.limparCamposDeTexto(campoNomeFuncionario, campoEnderecoFuncionario, campoSalarioFuncionario,
                campoCargaHFuncionario, campoLoginFuncionario, campoValorBonificacao);
        l.limparCamposDeSenha(campoSenhaFuncionario);
        l.limparCamposFormatados(campoCpfFuncionario);
        l.desmarcarRadios(radioGerente);
        l.desmarcarGrudoDeBotao(sexo);
    }//GEN-LAST:event_botaoVoltarCadastroFuncionarioActionPerformed

    private void botaoVoltarCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarCadastrarClienteActionPerformed
        LimparCampos l = new LimparCampos();
        mostrarPainel("painelCadastroConta");

        l.limparCamposDeTexto(campoNomeCliente, campoCpfCliente, campoEnderecoCliente);
        l.desmarcarGrudoDeBotao(sexo);
    }//GEN-LAST:event_botaoVoltarCadastrarClienteActionPerformed

    private void botaoVoltarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarNovaContaActionPerformed
        mostrarPainel("painelMenuGerente");
    }//GEN-LAST:event_botaoVoltarNovaContaActionPerformed

    private void botaoVoltarVizualizacaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarVizualizacaoFuncionarioActionPerformed
        LimparCampos l = new LimparCampos();
        mostrarPainel("painelMenuGerente");

        l.desmarcarGrudoDeBotao(sexo);
        l.limparCamposDeTexto(campoCodFuncionario, campoNomeFuncionario1, campoEnderecoFuncionario1, campoCpfFuncionario1,
                campoSalarioFuncionario1, campoCargaHFuncionario1, campoLoginFuncionario1);
    }//GEN-LAST:event_botaoVoltarVizualizacaoFuncionarioActionPerformed

    private void botaoVoltarVizualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarVizualizarClienteActionPerformed
        LimparCampos l = new LimparCampos();
        mostrarPainel("painelMenuGerente");

        l.limparCamposFormatados(campoCpfClienteBuscar);
        l.limparCamposDeTexto(campoNomeCliente1, campoCpfCliente1, campoEnderecoCliente1);
        l.desmarcarGrudoDeBotao(sexo);
    }//GEN-LAST:event_botaoVoltarVizualizarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        telaSaque = new Saque();
        telaSaque.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        telaDeposito = new Deposito();
        telaDeposito.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        telaExtrato = new Extrato();
        telaExtrato.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        telaTrans = new Transferencia();
        telaTrans.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mostrarPainel("painelMenuGerente");
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * * @param args the command line arguments
     *
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BancoSupremoApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoSupremoApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoSupremoApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoSupremoApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoSupremoApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarCliente;
    private javax.swing.JButton botaoAlterarFuncionario;
    private javax.swing.JButton botaoAtualizarCliente;
    private javax.swing.JButton botaoAtualizarCliente2;
    private javax.swing.JButton botaoAtualizarFuncionario;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoBuscarCliente;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoCadastrarFuncionario;
    private javax.swing.JButton botaoCadastrarNovaConta;
    private javax.swing.JButton botaoDeletarFuncionario;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JToggleButton botaoEntrarLogin;
    private javax.swing.JButton botaoRealizarOperacoes;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVoltarCadastrarCliente;
    private javax.swing.JButton botaoVoltarCadastroFuncionario;
    private javax.swing.JButton botaoVoltarNovaConta;
    private javax.swing.JButton botaoVoltarVizualizacaoFuncionario;
    private javax.swing.JButton botaoVoltarVizualizarCliente;
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JButton cadastrarFuncionario;
    private javax.swing.JButton cadastrarNovaConta;
    private javax.swing.JTextField campoCargaHFuncionario;
    private javax.swing.JTextField campoCargaHFuncionario1;
    private javax.swing.JTextField campoCodFuncionario;
    private javax.swing.JFormattedTextField campoCpfCliente;
    private javax.swing.JFormattedTextField campoCpfCliente1;
    private javax.swing.JFormattedTextField campoCpfClienteBuscar;
    private javax.swing.JFormattedTextField campoCpfClienteConta;
    private javax.swing.JFormattedTextField campoCpfFuncionario;
    private javax.swing.JTextField campoCpfFuncionario1;
    private javax.swing.JTextField campoEnderecoCliente;
    private javax.swing.JTextField campoEnderecoCliente1;
    private javax.swing.JTextField campoEnderecoFuncionario;
    private javax.swing.JTextField campoEnderecoFuncionario1;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoLoginFuncionario;
    private javax.swing.JTextField campoLoginFuncionario1;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoNomeCliente1;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JTextField campoNomeFuncionario1;
    private javax.swing.JTextField campoSalarioFuncionario;
    private javax.swing.JTextField campoSalarioFuncionario1;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPasswordField campoSenhaConta;
    private javax.swing.JPasswordField campoSenhaFuncionario;
    private javax.swing.JTextField campoValorBonificacao;
    private javax.swing.JLabel cpfCliente;
    private javax.swing.JLabel cpfCliente1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel nomeCliente;
    private javax.swing.JLabel nomeCliente1;
    private javax.swing.JPanel painelCadastrarFuncionario;
    private javax.swing.JPanel painelCadastroCliente;
    private javax.swing.JPanel painelCadastroConta;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelMenuFuncionario;
    private javax.swing.JPanel painelMenuGerente;
    private javax.swing.JPanel painelMenuOperacoes;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelVizualizarCliente;
    private javax.swing.JPanel painelVizualizarFuncionario;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioFeminino1;
    private javax.swing.JRadioButton radioFemininoCliente;
    private javax.swing.JRadioButton radioFemininoCliente1;
    private javax.swing.JRadioButton radioGerente;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioMasculino1;
    private javax.swing.JRadioButton radioMasculinoCliente;
    private javax.swing.JRadioButton radioMasculinoCliente1;
    private javax.swing.JButton realizarOperacoes;
    private javax.swing.JButton sair;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}

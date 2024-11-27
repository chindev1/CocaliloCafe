package com.example.teste03cocalilo;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloController {

    ValoresData data = new ValoresData();
    //VARIAVEIS
    double docesValTotal = 0, salgsValTotal = 0, bebsValTotal = 0;
    int valorTotal = 0;
    int carolina, sonho, moranguete, cupcake;
    int risolis, pastel, torta_frango, coxinha;
    int cappuccino, cafe, agua, coca;

    double risolisValores = 2, coxinhaValores = 4, tortaValores = 5, pastelValores = 6;
    double cappuccinoValores = 2.50, cafeValores = 3, aguaValores = 4, cocaValores = 4;
    double morangueteValores = 0.6, sonhoValores = 1.5, carolinaValores = 3.5, cupcakeValores = 5;

    private Stage stage;
    private Scene scene;
    private Parent root;
    String metodoPag = " ";
    //MENU CARDAPIOS

    @FXML
    public void menuBtnClick(ActionEvent actionEvent){

        try {
            root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setTitle("Cardápios");
            stage.setScene(new Scene(root));
            // Exibir a nova janela
            stage.show();

            System.out.println(this.valorTotal);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private Label valorTotalLabel;
    public void valorTotalLabel(){

        int valor = FileManager.loadValue();
        if (valor != -1) {
            System.out.println("Valor carregado: " + valor);
        } else {
            System.out.println("Falha ao carregar o valor.");
        }

        valorTotalLabel.setText("R$: " + valor);
    }

    String[] metodo;
    public void vetorMetodo(){
        metodo = new String[3];
        metodo[0] = "Debito";
        metodo[1] = "Credito";
        metodo[2] = "Pix";

    }
    //CARADAPIO DOS DOCES
    @FXML
    public void docesBtnClick(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("doces-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setTitle("Cardápio de Doces");
            stage.setScene(new Scene(root));
            // Exibir a nova janela
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void cupcakeBtnClick(ActionEvent actionEvent){
        System.out.println(this.valorTotal);
        this.valorTotal += cupcakeValores ;
        this.docesValTotal += cupcakeValores;
        cupcake ++;
        valoresDocesLabel();
    }
    public void morangueteBtnClick(ActionEvent actionEvent){

        System.out.println(valorTotal);
        valorTotal += morangueteValores ;
        docesValTotal += morangueteValores;
        moranguete ++;
        valoresDocesLabel();
    }
    public void sonhoBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += sonhoValores ;
        docesValTotal += sonhoValores;

        sonho ++;
        valoresDocesLabel();
    }
    public void carolinaBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += carolinaValores ;
        docesValTotal += carolinaValores ;
        carolina ++;
        valoresDocesLabel();
    }
    @FXML
    private Label valoresDocesLabel;
    public void valoresDocesLabel() {

        String valorTotalDocesStr = String.valueOf(this.docesValTotal);
        HelloController control = new HelloController();
        valoresDocesLabel.setText("R$: " + valorTotalDocesStr);
    }
    //CARDAPIO DOS SALGADOS
    @FXML
    public void salgsBtnClick(ActionEvent actionEvent) {
        int valor = FileManager.loadValue();
        if (valor != -1) {
            System.out.println("Valor carregado: " + valor);
        } else {
            System.out.println("Falha ao carregar o valor.");
        }
        try {
            root = FXMLLoader.load(getClass().getResource("salgs-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setTitle("Cardápio de Salgados");
            stage.setScene(new Scene(root));
            // Exibir a nova janela
            stage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void risolesBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += risolisValores ;
        salgsValTotal += risolisValores;
        risolis ++;
        valoresSalgsLabel();
    }
    public void coxinhaBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += coxinhaValores ;
        salgsValTotal += coxinhaValores;
        coxinha ++;
        valoresSalgsLabel();
    }
    public void pastelBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += pastelValores ;
        salgsValTotal += pastelValores;

        pastel ++;
        valoresSalgsLabel();
    }
    public void tortaBtnClick(ActionEvent actionEvent) throws IOException {

        data.setValoresTotal(tortaValores);  ;
        salgsValTotal += tortaValores ;
        torta_frango ++;
        valorTotal += tortaValores;
        FileManager.saveValue(valorTotal);
        System.out.println("Valor salvo com sucesso!");
        System.out.println(valorTotal);
        valoresSalgsLabel();
    }
    @FXML
    private Label valoresSalgsLabel;
    public void valoresSalgsLabel() {
        String valorTotalSalgsStr = String.valueOf(salgsValTotal);
        HelloController control = new HelloController();
        valoresSalgsLabel.setText("R$: " + valorTotalSalgsStr);
    }
    //CARDAPIO DAS BEBIDAS
    @FXML
    public void bebsBtnClick(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bebs-view.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        stage.setTitle("Cardápio de Bebidas");
        stage.setScene(new Scene(root));


        // Exibir a nova janela
        stage.show();

    }
    public void cocaBtnClick(ActionEvent actionEvent){

        System.out.println(valorTotal);
        valorTotal += cocaValores ;
        bebsValTotal += tortaValores ;
        torta_frango ++;
        valoresBebsLabel();
    }
    public void cafeBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += cafeValores ;
        bebsValTotal += cafeValores ;
        cafe ++;
        valoresBebsLabel();
    }
    public void cappuccinoBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += cappuccinoValores ;
        bebsValTotal += cappuccinoValores ;
        cappuccino ++;
        valoresBebsLabel();
    }
    public void aguaBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += aguaValores ;
        bebsValTotal += aguaValores ;
        agua ++;
        valoresBebsLabel();
    }
    @FXML
    private Label valoresBebsLabel;
    public void valoresBebsLabel(){
        String valorTotalBebsStr = String.valueOf(bebsValTotal);
        HelloController control = new HelloController();
        valoresBebsLabel.setText("R$: " + valorTotalBebsStr);
    }
    //FINALIZAR COMPRA
    public void finalizarBtnClick(ActionEvent actionEvent){
        try {
            root = FXMLLoader.load(getClass().getResource("finalizar-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setTitle("Finalizar Compra");
            stage.setScene(new Scene(root));

            // Exibir a nova janela
            stage.show();


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void credBtnClick(ActionEvent actionEvent){


        try {
            root = FXMLLoader.load(getClass().getResource("fimcompra-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Fim da Compra");
            stage.setScene(new Scene(root));

            // Exibir a nova janela
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void debBtnClick(ActionEvent actionEvent){

        try {
            root = FXMLLoader.load(getClass().getResource("fimcompra-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Fim da Compra");
            stage.setScene(new Scene(root));

            // Exibir a nova janela
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void pixBtnClick(ActionEvent actionEvent){

        try {
            root = FXMLLoader.load(getClass().getResource("fimcompraPix-view.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Fim da Compra");
            stage.setScene(new Scene(root));


            // Exibir a nova janela
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML private Label fimCompra;
    public void fimCompra(){
        System.out.println(metodoPag);
        fimCompra.setText("Compra finalizada como: " + metodoPag + " no valor de: " + valorTotal);
    }
    @FXML
    public void fecharJanela(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cardapios");
        stage.setScene(new Scene(root));
        // Exibir a nova janela
        stage.show();
    }
    public void fechar(ActionEvent actionEvent) {
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void btnDocesEntered(MouseEvent mouseEvent) {
    }
}
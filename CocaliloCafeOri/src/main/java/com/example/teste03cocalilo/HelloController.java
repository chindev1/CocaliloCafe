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

    //VARIAVEIS

    private double valorTotal = 0, docesValTotal = 0, salgsValTotal = 0, bebsValTotal = 0;
    public HelloController(){
        this.valorTotal = 0 ;
        this.docesValTotal = 0 ;
        this.salgsValTotal = 0 ;
        this.bebsValTotal = 0 ;
    }

    int carolina, sonho, moranguete, cupcake;
    int risolis, pastel, torta_frango, coxinha;
    int cappuccino, cafe, agua, coca;

    double risolisValores = 2, coxinhaValores = 4, tortaValores = 5, pastelValores = 6;
    double cappuccinoValores = 2.50, cafeValores = 3, aguaValores = 4, cocaValores = 4;
    double morangueteValores = 0.6, sonhoValores = 1.5, carolinaValores = 3.5, cupcakeValores = 5;

    //MENU CARDAPIOS
    @FXML
    public void menuBtnClick(ActionEvent actionEvent){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stageMenuClick = new Stage();
            stageMenuClick.setTitle("Menu Cardapios");
            stageMenuClick.setScene(new Scene(root));
            // Exibir a nova janela
            stageMenuClick.show();
            System.out.println(this.valorTotal);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //CARADAPIO DOS DOCES
    @FXML
    public void docesBtnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("doces-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage salgsBtnClick = new Stage();
            salgsBtnClick.setTitle("Cardápio de Doces");
            salgsBtnClick.setScene(new Scene(root));
            // Exibir a nova janela
            salgsBtnClick.show();

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
        valoresDocesLabel.setText("R$:" + valorTotalDocesStr);
    }

    //CARDAPIO DOS SALGADOS
    @FXML
    public void salgsBtnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("salgs-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage salgsBtnClick = new Stage();
            salgsBtnClick.setTitle("Cardápio de Salgados");
            salgsBtnClick.setScene(new Scene(root));
            // Exibir a nova janela
            salgsBtnClick.show();

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
    public void tortaBtnClick(ActionEvent actionEvent){
        System.out.println(valorTotal);
        valorTotal += tortaValores ;
        salgsValTotal += tortaValores ;
        torta_frango ++;
        valoresSalgsLabel();
    }
    @FXML
    private Label valoresSalgsLabel;
    public void valoresSalgsLabel() {
        String valorTotalSalgsStr = String.valueOf(salgsValTotal);
        HelloController control = new HelloController();
        valoresSalgsLabel.setText("R$:" + valorTotalSalgsStr);
    }

    //CARDAPIO DAS BEBIDAS
    @FXML
    public void bebsBtnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bebs-view.fxml"));
        Parent root = fxmlLoader.load();

        Stage bebsBtnClick = new Stage();
        bebsBtnClick.setTitle("Cardápio de Bebidas");
        bebsBtnClick.setScene(new Scene(root));
        bebsBtnClick.show();
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
        valoresBebsLabel.setText("R$:" + valorTotalBebsStr);
    }
    //FINALIZAR COMPRA

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void btnDocesEntered(MouseEvent mouseEvent) {
    }
}
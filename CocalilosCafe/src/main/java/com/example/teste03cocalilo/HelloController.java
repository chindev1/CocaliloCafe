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

import java.io.IOException;

public class HelloController {
    private Pedido pedido = new Pedido();

    int carolina, sonho, moranguete, cupcake;
    int risolis, pastel, torta_frango, coxinha;
    int cappuccino, cafe, agua, coca;

    double risolisValores = 2, coxinhaValores = 4, tortaValores = 5, pastelValores = 6;
    double cappuccinoValores = 2.50, cafeValores = 3, aguaValores = 4, cocaValores = 4;
    double morangueteValores = 0.6, sonhoValores = 1.5, carolinaValores = 3.5, cupcakeValores = 5;

    @FXML
    private Label valoresDocesLabel;
    @FXML
    private Label valoresSalgsLabel;
    @FXML
    private Label valoresBebsLabel;

    // MENU CARDAPIOS
    @FXML
    public void menuBtnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stageMenuClick = new Stage();
            stageMenuClick.setTitle("Menu Cardápios");
            stageMenuClick.setScene(new Scene(root));
            stageMenuClick.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // MÉTODOS DOS DOCES
    @FXML
    public void docesBtnClick(ActionEvent actionEvent) {
        abrirCardapio("doces-view.fxml", "Cardápio de Doces");
    }
    public void cupcakeBtnClick(ActionEvent actionEvent) {
        adicionarItem(cupcakeValores, "doces");
        cupcake++;
    }
    public void morangueteBtnClick(ActionEvent actionEvent) {
        adicionarItem(morangueteValores, "doces");
        moranguete++;
    }
    public void sonhoBtnClick(ActionEvent actionEvent) {
        adicionarItem(sonhoValores, "doces");
        sonho++;
    }
    public void carolinaBtnClick(ActionEvent actionEvent) {
        adicionarItem(carolinaValores, "doces");
        carolina++;
    }
    private void atualizarLabel(String tipo) {
        switch (tipo) {
            case "doces":
                valoresDocesLabel.setText("R$:" + pedido.getValorDoces());
                break;
            case "salgados":
                valoresSalgsLabel.setText("R$:" + pedido.getValorSalgados());
                break;
            case "bebidas":
                valoresBebsLabel.setText("R$:" + pedido.getValorBebidas());
                break;
        }
    }

    // MÉTODOS DOS SALGADOS
    @FXML
    public void salgsBtnClick(ActionEvent actionEvent) {
        abrirCardapio("salgs-view.fxml", "Cardápio de Salgados");
    }
    public void risolesBtnClick(ActionEvent actionEvent) {
        adicionarItem(risolisValores, "salgados");
        risolis++;
    }
    public void coxinhaBtnClick(ActionEvent actionEvent) {
        adicionarItem(coxinhaValores, "salgados");
        coxinha++;
    }
    public void pastelBtnClick(ActionEvent actionEvent) {
        adicionarItem(pastelValores, "salgados");
        pastel++;
    }
    public void tortaBtnClick(ActionEvent actionEvent) {
        adicionarItem(tortaValores, "salgados");
        torta_frango++;
    }

    // MÉTODOS DAS BEBIDAS
    @FXML
    public void bebsBtnClick(ActionEvent actionEvent) {
        abrirCardapio("bebs-view.fxml", "Cardápio de Bebidas");
    }
    public void cocaBtnClick(ActionEvent actionEvent) {
        adicionarItem(cocaValores, "bebidas");
        coca++;
    }
    public void cafeBtnClick(ActionEvent actionEvent) {
        adicionarItem(cafeValores, "bebidas");
        cafe++;
    }
    public void cappuccinoBtnClick(ActionEvent actionEvent) {
        adicionarItem(cappuccinoValores, "bebidas");
        cappuccino++;
    }
    public void aguaBtnClick(ActionEvent actionEvent) {
        adicionarItem(aguaValores, "bebidas");
        agua++;
    }

    // MÉTODOS DE AJUDA
    private void adicionarItem(double valor, String tipo) {
        switch (tipo) {
            case "doces":
                pedido.adicionarDoces(valor);
                break;
            case "salgados":
                pedido.adicionarSalgados(valor);
                break;
            case "bebidas":
                pedido.adicionarBebidas(valor);
                break;
        }
        atualizarLabel(tipo);
    }

    private void abrirCardapio(String fxml, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void btnDocesEntered(MouseEvent mouseEvent) {
    }
}

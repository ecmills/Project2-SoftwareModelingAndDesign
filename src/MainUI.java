
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public JFrame view;

    public JButton btnManageCustomers = new JButton("Manage Customers");
    public JButton btnManagePurchases = new JButton("Manage Purchases");
    public JButton btnManageProducts = new JButton("Manage Products");

    public MainUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProducts);
        panelButtons.add(btnManageCustomers);
        panelButtons.add(btnManagePurchases);

        view.getContentPane().add(panelButtons);


        btnManagePurchases.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManagePurchasesUI ui = new ManagePurchasesUI();
                ui.run();
            }
        });

        btnManageProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageProductsUI ui = new ManageProductsUI();
                ui.run();
            }
        });

        btnManageCustomers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageCustomersUI ui = new ManageCustomersUI();
                ui.run();
            }
        });

    }
}

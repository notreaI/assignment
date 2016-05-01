public class PixelWidth extends JFrame implements ActionListener{
	private JMenu menu = new JMenu("action");
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem action = new JMenuItem("calculate");
	private JMenuItem exit = new JMenuItem("exit");
	private JTextField size = new JTextField("Screen size");
	private JTextField hResolusion = new JTextField("Horizontal resolusion");
	private JLabel label = new JLabel("");
	public PixelWidth(){
		setLayout(new FlowLayout());
		setJMenubar(menuBar);
		menuBar.add(menu);
		menu.add(action);
		menu.add(exit);
		add(size);
		add(hResolusion);
		add(label);
		pack();
		action.addActionListener(this);
		menu.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent event)
		if(event.getSource()==action){
			
		}else if (event.getSource()==exit){
			
		}
}
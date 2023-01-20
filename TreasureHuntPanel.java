import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

import java.awt.event.*;

public class TreasureHuntPanel extends JPanel{


	private PuzzleTile tr, bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8;
	private int hp;
	private boolean isOver;
	private ArrayList<PuzzleTile> list;
	private Integer[] listIndex;

	private JPanel container, cPanel,nPanel,sPanel,ePanel,wPanel;
	private JButton startGame;
	JTextArea statusBoard;
	JScrollPane statusScroll;

	public TreasureHuntPanel(){

		isOver = true;

		//container panel
		container = new JPanel();
		container.setPreferredSize(new Dimension(800,600));
		container.setBackground(new Color(21,21,21));
		container.setLayout(new BorderLayout());

		//center panel
		cPanel = new JPanel();
		cPanel.setPreferredSize(new Dimension(600,400));
		cPanel.setBackground(new Color(121,121,121));
		cPanel.setLayout(new GridLayout(3,3));
		
		container.add(cPanel,BorderLayout.CENTER);
		add(container);

		//north panel
		nPanel = new JPanel();
		nPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		nPanel.setBackground(new Color(221,121,21));
		JLabel label = new JLabel("Treasure Hunt Game");
		label.setFont(new Font("Papyrus",Font.PLAIN,24));
		nPanel.add(label);
		container.add(nPanel,BorderLayout.NORTH);

		//south panel
		sPanel = new JPanel();
		sPanel.setBorder(BorderFactory.createLoweredBevelBorder());
		sPanel.setLayout(new GridLayout(1,2));

		startGame = new JButton("Start Game");
		startGame.addActionListener(new ButtonListener());
		
		statusBoard = new JTextArea("Status Board");
		statusBoard.setFont(new Font("Papyrus", Font.PLAIN, 14));
		statusBoard.setBackground(new Color(191,183,123));
		statusBoard.append("\nPress \"Start Game\"");
		statusScroll = new JScrollPane(statusBoard);
		statusScroll.getViewport().setPreferredSize(new Dimension(100,200));

		sPanel.add(startGame);
		sPanel.add(statusScroll);
		container.add(sPanel,BorderLayout.SOUTH);

		//east panel
		ePanel = new JPanel();
		ePanel.setPreferredSize(new Dimension(100,400));
		ePanel.setBorder(BorderFactory.createRaisedBevelBorder());
		//ePanel.setBackground(new Color(21,255,21));
		ImageIcon img1 = new ImageIcon("asset/long1.jpg");
		JLabel bannerE = new JLabel(img1);
		ePanel.add(bannerE);
		container.add(ePanel,BorderLayout.EAST);

		//west panel
		wPanel = new JPanel();
		wPanel.setPreferredSize(new Dimension(100,400));
		wPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		ImageIcon img2 = new ImageIcon("asset/long2.jpg");
		JLabel bannerW = new JLabel(img2);
		wPanel.add(bannerW);
		container.add(wPanel,BorderLayout.WEST);
	

	}

	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		
		if(!isOver){

			if(e.getSource() == tr){
				tr.setEnabled(false);
				tr.clicked();
				statusBoard.append("\n"+"It's the treasure. You win!"+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				isOver = true;
			}
			else if(e.getSource() == bl1){
				bl1.setEnabled(false);
				bl1.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl2){
				bl2.setEnabled(false);
				bl2.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl3){
				bl3.setEnabled(false);
				bl3.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl4){
				bl4.setEnabled(false);
				bl4.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl5){
				bl5.setEnabled(false);
				bl5.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl6){
				bl6.setEnabled(false);
				bl6.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl7){
				bl7.setEnabled(false);
				bl7.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}
			else if(e.getSource() == bl8){
				bl8.setEnabled(false);
				bl8.clicked();
				statusBoard.append("\n"+"A blank tile! -1 HP."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());
				hp--;
				if(hp == 0){
					isOver = true;
					statusBoard.append("\n"+"You Lose. Try Again."+"\n");

				}
			}

		}else if(isOver){
			if(e.getSource() == startGame){
				hp = 3;

				statusBoard.append("\n"+"Start Game Button is pressed."+"\n");
				JScrollBar v = statusScroll.getVerticalScrollBar();
				v.setValue(v.getMaximum());


				container.remove(cPanel);

				ArrayList<PuzzleTile> list = new ArrayList<PuzzleTile>();

				tr = new TreasureTile();
				tr.addActionListener(new ButtonListener());
				list.add(tr);

				bl1 = new BlankTile();
				bl1.addActionListener(new ButtonListener());
				list.add(bl1);

				bl2 = new BlankTile();
				bl2.addActionListener(new ButtonListener());
				list.add(bl2);

				bl3 = new BlankTile();
				bl3.addActionListener(new ButtonListener());
				list.add(bl3);
		
				bl4 = new BlankTile();
				bl4.addActionListener(new ButtonListener());
				list.add(bl4);

				bl5 = new BlankTile();
				bl5.addActionListener(new ButtonListener());
				list.add(bl5);

				bl6 = new BlankTile();
				bl6.addActionListener(new ButtonListener());
				list.add(bl6);

				bl7 = new BlankTile();
				bl7.addActionListener(new ButtonListener());
				list.add(bl7);

				bl8 = new BlankTile();
				bl8.addActionListener(new ButtonListener());
				list.add(bl8);

				//randomize the index to the parent type arraylist
				Random rand = new Random();
				Integer[] listIndex = {0,1,2,3,4,5,6,7,8};
				for (int i = listIndex.length - 1; i>0; i--){
					int j  = rand.nextInt(i+1);
					int temp = listIndex[i];
					listIndex[i] = listIndex[j];
					listIndex[j] = temp;
				}

				

				cPanel = new JPanel();
				cPanel.setPreferredSize(new Dimension(600,400));
				cPanel.setBackground(new Color(121,121,121));
				cPanel.setLayout(new GridLayout(3,3));


				cPanel.add(list.get(listIndex[0]));
				cPanel.add(list.get(listIndex[1]));
				cPanel.add(list.get(listIndex[2]));
				cPanel.add(list.get(listIndex[3]));
				cPanel.add(list.get(listIndex[4]));
				cPanel.add(list.get(listIndex[5]));
				cPanel.add(list.get(listIndex[6]));
				cPanel.add(list.get(listIndex[7]));
				cPanel.add(list.get(listIndex[8]));
				container.add(cPanel,BorderLayout.CENTER);
          			container.revalidate();
        			container.repaint();
				add(container);

				isOver = false;
				
				statusBoard.setText("Status Board");
				statusBoard.append("\nYou have "+hp+" HP.");

			}

		}
			
		}
	}

}
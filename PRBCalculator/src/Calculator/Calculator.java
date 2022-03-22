package Calculator;

public class Calculator {

	int pRB = 0;
	double downLinkFreq = 0;
	double bW = 0;
	double upLinkChannel = 0;
	double upLinkFreq = 0;
	double[] pRBLow;
	double[] pRBHigh;
	int[] pRBNumber;
	double[] logicalUplink;
	double[] logicalLow;
	double[] logicalHigh;
	int userEARFCN;
	
	int bandClass;
	double[] downLinkFrequency;
	double[] upLinkFrequency;
	int[] downLinkEARFCN;
	int[] upLinkEARFCN;
	int upLinkEARFCNStart;
	int upLinkEARFCNReturn;
	
	
	public Calculator(double BW, int DLEARFCN, int PRB, int BandClass)
	{
		bW = BW;
		pRB = PRB;
		userEARFCN = DLEARFCN;
		bandClass = BandClass;
		System.out.println(bandClass);
		eARFCN(bandClass);
		for (int i = 0; i < downLinkEARFCN.length; i++)
		{
			if (downLinkEARFCN[i] == userEARFCN)
			{
				downLinkFreq = downLinkFrequency[i];
				upLinkFreq = upLinkFrequency[i];
				System.out.println("BandClass: " + BandClass);
				System.out.println("If selected downlink EARFCN is: "+downLinkEARFCN[i]);
			}
		}
		if (bW == 1.4)
		{
			pRBLow = new double[6];
			pRBHigh = new double[6];
			pRBNumber = new int[6];
			logicalLow = new double[14];
			logicalHigh = new double[14];
			logicalUplink = new double[14];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - .540 + (i*.180);
				pRBHigh[i] = upLinkFreq - .360 +(i*.180);
				Math.round(pRBLow[i]);
				Math.round(pRBHigh[i]);
				pRBNumber[i] = i;
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				logicalLow[j] = upLinkFreq - .6 + (j*.100);
				logicalHigh[j] = upLinkFreq - .5 + (j*.100);
				logicalUplink[j] = upLinkFreq -.5 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
			}
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
		if (bW == 3)
		{
			pRBLow = new double[15];
			pRBHigh = new double[15];
			pRBNumber = new int[15];
			logicalLow = new double[27];
			logicalHigh = new double[27];
			logicalUplink = new double[27];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - 1.35 + (i*.180);
				pRBHigh[i] = upLinkFreq - 1.17 +(i*.180);
				Math.round(pRBLow[i]);
				Math.round(pRBHigh[i]);
				pRBNumber[i] = i;
				//System.out.println(pRBNumber[i]);
				//System.out.println(pRBLow[i]);
				//System.out.println(pRBHigh[i]);
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				//System.out.println(upLinkFreq);
				logicalLow[j] = upLinkFreq - 1.4 + (j*.100);
				logicalHigh[j] = upLinkFreq - 1.3 + (j*.100);
				logicalUplink[j] = upLinkFreq -1.3 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
			}
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
		if (bW == 5)
		{
			pRBLow = new double[25];
			pRBHigh = new double[25];
			pRBNumber = new int[25];
			logicalLow = new double[45];
			logicalHigh = new double[45];
			logicalUplink = new double[45];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - 2.25 + (i*.180);
				pRBHigh[i] = upLinkFreq - 2.07 +(i*.180);
				Math.round(pRBLow[i]);
				Math.round(pRBHigh[i]);
				pRBNumber[i] = i;
				System.out.println(pRBNumber[i]);
				System.out.println(pRBLow[i]);
				System.out.println(pRBHigh[i]);
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				//System.out.println(upLinkFreq);
				logicalLow[j] = upLinkFreq - 2.3 + (j*.100);
				logicalHigh[j] = upLinkFreq - 2.2 + (j*.100);
				logicalUplink[j] = upLinkFreq -2.2 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
			}
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
		if (bW == 10)
		{
			pRBLow = new double[50];
			pRBHigh = new double[50];
			pRBNumber = new int[50];
			logicalLow = new double[90];
			logicalHigh = new double[90];
			logicalUplink = new double[90];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - 4.5 + (i*.180);
				pRBHigh[i] = upLinkFreq - 4.32 +(i*.180);
				Math.round(pRBLow[i]);
				Math.round(pRBHigh[i]);
				pRBNumber[i] = i;
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				logicalLow[j] = upLinkFreq - 4.5 + (j*.100);
				logicalHigh[j] = upLinkFreq - 4.4 + (j*.100);
				logicalUplink[j] = upLinkFreq -4.4 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
			}
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
		if (bW == 15)
		{
			pRBLow = new double[75];
			pRBHigh = new double[75];
			pRBNumber = new int[75];
			logicalLow = new double[135];
			logicalHigh = new double[135];
			logicalUplink = new double[135];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - 6.75 + (i*.180);
				pRBHigh[i] = upLinkFreq - 6.57 +(i*.180);
				Math.round(pRBLow[i]);
				Math.round(pRBHigh[i]);
				pRBNumber[i] = i;
				System.out.println(pRBNumber[i]);
				System.out.println(pRBLow[i]);
				System.out.println(pRBHigh[i]);
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				//System.out.println(upLinkFreq);
				logicalLow[j] = upLinkFreq - 6.8 + (j*.100);
				logicalHigh[j] = upLinkFreq - 6.7 + (j*.100);
				logicalUplink[j] = upLinkFreq -6.7 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
			}
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
		if (bW == 20)
		{
			pRBLow = new double[100];
			pRBHigh = new double[100];
			pRBNumber = new int[100];
			logicalLow = new double[180];
			logicalHigh = new double[180];
			logicalUplink = new double[180];
			for (int i = 0; i < pRBNumber.length; i++)
			{
				pRBLow[i] = upLinkFreq - 9 + (i*.180);
				pRBHigh[i] = upLinkFreq - 8.82 +(i*.180);
				pRBNumber[i] = i;
				System.out.println(pRBNumber[i]);
				System.out.println(pRBLow[i]);
				System.out.println(pRBHigh[i]);
			}
			for (int j = 0; j < logicalUplink.length; j++)
			{
				logicalLow[j] = upLinkFreq - 9 + (j*.100);
				logicalHigh[j] = upLinkFreq - 8.9 + (j*.100);
				logicalUplink[j] = upLinkFreq -8.9 + (j*.100);
				logicalUplink[j] = round(logicalUplink[j], 1);
				System.out.println(logicalUplink[j]);
			}
			System.out.println(upLinkFreq);
			System.out.println("Then uplink EARFCN is " +pRBReturn());
		}
	}
	private static double round(double value, int precision)
	{
		int scale = (int) Math.pow(10, precision);
		return (double) Math.round(value*scale)/scale;
	}
	public double pRBReturn() {
		for (int i = 0; i < logicalUplink.length; i++)
		{
			if (logicalLow[i] >= pRBLow[pRB] && logicalHigh[i] <= pRBHigh[pRB])
			{
				System.out.println(logicalLow[i]);
				for (int j = 0; j < upLinkEARFCN.length; j++)
				{
					if (upLinkFrequency[j] == logicalUplink[i])
					{
						//System.out.println("If downlink EARFCN is :" +downLinkEARFCN[j]);
						upLinkEARFCNReturn = upLinkEARFCN[j];
						//System.out.println(pRBLow[pRB]);
						//System.out.println(pRBHigh[pRB]);
						
						System.out.println("UpLink Frequency is :" + upLinkFreq);
						System.out.println("And we are told PRB: "+ pRB);
						System.out.println(upLinkFrequency[j]);
						return upLinkEARFCNReturn;
					}
				}
				
			}
		}
		return 0;
	}
	public int eARFCN(int bandClass)
	{
		if (bandClass == 1)
		{
			downLinkEARFCN = new int[600];
			upLinkEARFCN = new int[600];
			downLinkFrequency = new double[600];
			upLinkFrequency = new double[600];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i;
				downLinkFrequency[i] = 2110 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1920 + (i*.1);
			}
		}
		if (bandClass == 2)
		{
			downLinkEARFCN = new int[600];
			upLinkEARFCN = new int[600];
			downLinkFrequency = new double[600];
			upLinkFrequency = new double[600];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+600;
				downLinkFrequency[i] = 1930 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1850 + (i*.1);
			}
		}
		if (bandClass == 3)
		{
			downLinkEARFCN = new int[750];
			upLinkEARFCN = new int[750];
			downLinkFrequency = new double[750];
			upLinkFrequency = new double[750];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+1200;
				downLinkFrequency[i] = 1805 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1710 + (i*.1);
			}
		}
		if (bandClass == 4)
		{
			downLinkEARFCN = new int[450];
			upLinkEARFCN = new int[450];
			downLinkFrequency = new double[450];
			upLinkFrequency = new double[450];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+1950;
				downLinkFrequency[i] = 2110 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1710 + (i*.1);
			}
		}
		if (bandClass == 5)
		{
			downLinkEARFCN = new int[250];
			upLinkEARFCN = new int[250];
			downLinkFrequency = new double[250];
			upLinkFrequency = new double[250];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+2400;
				downLinkFrequency[i] = 869 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 824 + (i*.1);
			}
		}
		if (bandClass == 7)
		{
			downLinkEARFCN = new int[700];
			upLinkEARFCN = new int[700];
			downLinkFrequency = new double[700];
			upLinkFrequency = new double[700];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+2750;
				downLinkFrequency[i] = 2620 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 2500 + (i*.1);
			}
		}
		if (bandClass == 8)
		{
			downLinkEARFCN = new int[350];
			upLinkEARFCN = new int[350];
			downLinkFrequency = new double[350];
			upLinkFrequency = new double[350];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+3450;
				downLinkFrequency[i] = 925 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 880 + (i*.1);
			}
		}
		if (bandClass == 9)
		{
			downLinkEARFCN = new int[350];
			upLinkEARFCN = new int[350];
			downLinkFrequency = new double[350];
			upLinkFrequency = new double[350];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+3800;
				downLinkFrequency[i] = 1844.9 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1749.9 + (i*.1);
			}
		}
		if (bandClass == 10)
		{
			downLinkEARFCN = new int[600];
			upLinkEARFCN = new int[600];
			downLinkFrequency = new double[600];
			upLinkFrequency = new double[600];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+4150;
				downLinkFrequency[i] = 2110 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1710 + (i*.1);
			}
		}
		if (bandClass == 11)
		{
			downLinkEARFCN = new int[200];
			upLinkEARFCN = new int[200];
			downLinkFrequency = new double[200];
			upLinkFrequency = new double[200];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+4750;
				downLinkFrequency[i] = 1475.9 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1427.9 + (i*.1);
			}
		}
		if (bandClass == 12)
		{
			downLinkEARFCN = new int[170];
			upLinkEARFCN = new int[170];
			downLinkFrequency = new double[170];
			upLinkFrequency = new double[170];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+5010;
				downLinkFrequency[i] = 729 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 699 + (i*.1);
			}
		}
		if (bandClass == 13)
		{
			downLinkEARFCN = new int[100];
			upLinkEARFCN = new int[100];
			downLinkFrequency = new double[100];
			upLinkFrequency = new double[100];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+5180;
				downLinkFrequency[i] = 746 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 777 + (i*.1);
			}
		}
		if (bandClass == 14)
		{
			downLinkEARFCN = new int[100];
			upLinkEARFCN = new int[100];
			downLinkFrequency = new double[100];
			upLinkFrequency = new double[100];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+5280;
				downLinkFrequency[i] = 758 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 788 + (i*.1);
			}
		}
		if (bandClass == 17)
		{
			downLinkEARFCN = new int[120];
			upLinkEARFCN = new int[120];
			downLinkFrequency = new double[120];
			upLinkFrequency = new double[120];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+5730;
				downLinkFrequency[i] = 734 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 704 + (i*.1);
			}
		}
		if (bandClass == 18)
		{
			downLinkEARFCN = new int[150];
			upLinkEARFCN = new int[150];
			downLinkFrequency = new double[150];
			upLinkFrequency = new double[150];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+5850;
				downLinkFrequency[i] = 860 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 815 + (i*.1);
			}
		}
		if (bandClass == 19)
		{
			downLinkEARFCN = new int[150];
			upLinkEARFCN = new int[150];
			downLinkFrequency = new double[150];
			upLinkFrequency = new double[150];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+6000;
				downLinkFrequency[i] = 875 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 830 + (i*.1);
			}
		}
		if (bandClass == 20)
		{
			downLinkEARFCN = new int[300];
			upLinkEARFCN = new int[300];
			downLinkFrequency = new double[300];
			upLinkFrequency = new double[300];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+6150;
				downLinkFrequency[i] = 791 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 832 + (i*.1);
			}
		}
		if (bandClass == 21)
		{
			downLinkEARFCN = new int[150];
			upLinkEARFCN = new int[150];
			downLinkFrequency = new double[150];
			upLinkFrequency = new double[150];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+6450;
				downLinkFrequency[i] = 1495.9 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1447.9 + (i*.1);
			}
		}
		if (bandClass == 22)
		{
			downLinkEARFCN = new int[800];
			upLinkEARFCN = new int[800];
			downLinkFrequency = new double[800];
			upLinkFrequency = new double[800];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+6600;
				downLinkFrequency[i] = 3510 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 3410 + (i*.1);
			}
		}
		if (bandClass == 24)
		{
			downLinkEARFCN = new int[340];
			upLinkEARFCN = new int[340];
			downLinkFrequency = new double[340];
			upLinkFrequency = new double[340];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+7700;
				downLinkFrequency[i] = 1525 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1626.5 + (i*.1);
			}
		}
		if (bandClass == 25)
		{
			downLinkEARFCN = new int[650];
			upLinkEARFCN = new int[650];
			downLinkFrequency = new double[650];
			upLinkFrequency = new double[650];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+8040;
				downLinkFrequency[i] = 1930 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 1850 + (i*.1);
			}
		}
		if (bandClass == 26)
		{
			downLinkEARFCN = new int[350];
			upLinkEARFCN = new int[350];
			downLinkFrequency = new double[350];
			upLinkFrequency = new double[350];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+8690;
				downLinkFrequency[i] = 859 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 814 + (i*.1);
			}
		}
		if (bandClass == 27)
		{
			downLinkEARFCN = new int[170];
			upLinkEARFCN = new int[170];
			downLinkFrequency = new double[170];
			upLinkFrequency = new double[170];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9040;
				downLinkFrequency[i] = 852 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 807 + (i*.1);
			}
		}
		if (bandClass == 28)
		{
			downLinkEARFCN = new int[450];
			upLinkEARFCN = new int[450];
			downLinkFrequency = new double[450];
			upLinkFrequency = new double[450];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9210;
				downLinkFrequency[i] = 758 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 703 + (i*.1);
			}
		}
		if (bandClass == 29)
		{
			downLinkEARFCN = new int[110];
			upLinkEARFCN = new int[110];
			downLinkFrequency = new double[110];
			upLinkFrequency = new double[110];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9660;
				downLinkFrequency[i] = 717 + (i*.1);
				upLinkEARFCN[i] = i + 9660;
				upLinkFrequency[i] = 717 + (i*.1);
			}
		}
		if (bandClass == 30)
		{
			downLinkEARFCN = new int[100];
			upLinkEARFCN = new int[100];
			downLinkFrequency = new double[100];
			upLinkFrequency = new double[100];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9770;
				downLinkFrequency[i] = 2350 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 2305 + (i*.1);
			}
		}
		if (bandClass == 31)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9870;
				downLinkFrequency[i] = 462.5 + (i*.1);
				upLinkEARFCN[i] = 18000+ downLinkEARFCN[i];
				upLinkFrequency[i] = 452.5 + (i*.1);
			}
		}
		if (bandClass == 32)
		{
			downLinkEARFCN = new int[440];
			upLinkEARFCN = new int[440];
			downLinkFrequency = new double[440];
			upLinkFrequency = new double[440];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+9920;
				downLinkFrequency[i] = 1452 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = 1452 + (i*.1);
			}
		}
		if (bandClass == 33)
		{
			downLinkEARFCN = new int[200];
			upLinkEARFCN = new int[200];
			downLinkFrequency = new double[200];
			upLinkFrequency = new double[200];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+36000;
				downLinkFrequency[i] = 1900 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 34)
		{
			downLinkEARFCN = new int[150];
			upLinkEARFCN = new int[150];
			downLinkFrequency = new double[150];
			upLinkFrequency = new double[150];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+36200;
				downLinkFrequency[i] = 2010 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 35)
		{
			downLinkEARFCN = new int[600];
			upLinkEARFCN = new int[600];
			downLinkFrequency = new double[600];
			upLinkFrequency = new double[600];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+36350;
				downLinkFrequency[i] = 1850 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 36)
		{
			downLinkEARFCN = new int[600];
			upLinkEARFCN = new int[600];
			downLinkFrequency = new double[600];
			upLinkFrequency = new double[600];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+36950;
				downLinkFrequency[i] = 1930 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 37)
		{
			downLinkEARFCN = new int[200];
			upLinkEARFCN = new int[200];
			downLinkFrequency = new double[200];
			upLinkFrequency = new double[200];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+37550;
				downLinkFrequency[i] = 1910 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 38)
		{
			downLinkEARFCN = new int[500];
			upLinkEARFCN = new int[500];
			downLinkFrequency = new double[500];
			upLinkFrequency = new double[500];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+37750;
				downLinkFrequency[i] = 2570 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 39)
		{
			downLinkEARFCN = new int[400];
			upLinkEARFCN = new int[400];
			downLinkFrequency = new double[400];
			upLinkFrequency = new double[400];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+38250;
				downLinkFrequency[i] = 1880 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 40)
		{
			downLinkEARFCN = new int[1000];
			upLinkEARFCN = new int[1000];
			downLinkFrequency = new double[1000];
			upLinkFrequency = new double[1000];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+38650;
				downLinkFrequency[i] = 2300 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 41)
		{
			downLinkEARFCN = new int[1940];
			upLinkEARFCN = new int[1940];
			downLinkFrequency = new double[1940];
			upLinkFrequency = new double[1940];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+39650;
				downLinkFrequency[i] = 2496 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 42)
		{
			downLinkEARFCN = new int[2000];
			upLinkEARFCN = new int[2000];
			downLinkFrequency = new double[2000];
			upLinkFrequency = new double[2000];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+41590;
				downLinkFrequency[i] = 3400 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 43)
		{
			downLinkEARFCN = new int[2000];
			upLinkEARFCN = new int[2000];
			downLinkFrequency = new double[2000];
			upLinkFrequency = new double[2000];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+43590;
				downLinkFrequency[i] = 3600 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 44)
		{
			downLinkEARFCN = new int[1000];
			upLinkEARFCN = new int[1000];
			downLinkFrequency = new double[1000];
			upLinkFrequency = new double[1000];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+45590;
				downLinkFrequency[i] = 703 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 45)
		{
			downLinkEARFCN = new int[200];
			upLinkEARFCN = new int[200];
			downLinkFrequency = new double[200];
			upLinkFrequency = new double[200];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+46590;
				downLinkFrequency[i] = 1447 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 46)
		{
			downLinkEARFCN = new int[7750];
			upLinkEARFCN = new int[7750];
			downLinkFrequency = new double[7750];
			upLinkFrequency = new double[7750];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+46790;
				downLinkFrequency[i] = 5150 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 47)
		{
			downLinkEARFCN = new int[700];
			upLinkEARFCN = new int[700];
			downLinkFrequency = new double[700];
			upLinkFrequency = new double[700];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+54540;
				downLinkFrequency[i] = 5855 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 48)
		{
			downLinkEARFCN = new int[1500];
			upLinkEARFCN = new int[1500];
			downLinkFrequency = new double[1500];
			upLinkFrequency = new double[1500];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+55240;
				downLinkFrequency[i] = 3550 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 49)
		{
			downLinkEARFCN = new int[1500];
			upLinkEARFCN = new int[1500];
			downLinkFrequency = new double[1500];
			upLinkFrequency = new double[1500];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+56740;
				downLinkFrequency[i] = 3550 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 50)
		{
			downLinkEARFCN = new int[850];
			upLinkEARFCN = new int[850];
			downLinkFrequency = new double[850];
			upLinkFrequency = new double[850];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+58240;
				downLinkFrequency[i] = 1432 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 51)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+59090;
				downLinkFrequency[i] = 1427 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 52)
		{
			downLinkEARFCN = new int[1000];
			upLinkEARFCN = new int[1000];
			downLinkFrequency = new double[1000];
			upLinkFrequency = new double[1000];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+59140;
				downLinkFrequency[i] = 3300 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 53)
		{
			downLinkEARFCN = new int[115];
			upLinkEARFCN = new int[115];
			downLinkFrequency = new double[115];
			upLinkFrequency = new double[115];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+60140;
				downLinkFrequency[i] = 2483.5 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 65)
		{
			downLinkEARFCN = new int[900];
			upLinkEARFCN = new int[900];
			downLinkFrequency = new double[900];
			upLinkFrequency = new double[900];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+65536;
				downLinkFrequency[i] = 2110 + (i*.1);
				upLinkEARFCN[i] = 65536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 1920 + (i*.1);
			}
		}
		if (bandClass == 66)
		{
			downLinkEARFCN = new int[900];
			upLinkEARFCN = new int[900];
			downLinkFrequency = new double[900];
			upLinkFrequency = new double[900];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+66436;
				downLinkFrequency[i] = 2110 + (i*.1);
				upLinkEARFCN[i] = 65536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 1710+(i*.1);
			}
		}
		if (bandClass == 67)
		{
			downLinkEARFCN = new int[200];
			upLinkEARFCN = new int[200];
			downLinkFrequency = new double[200];
			upLinkFrequency = new double[200];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+66436;
				downLinkFrequency[i] = 738 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 68)
		{
			downLinkEARFCN = new int[300];
			upLinkEARFCN = new int[300];
			downLinkFrequency = new double[300];
			upLinkFrequency = new double[300];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+67536;
				downLinkFrequency[i] = 753 + (i*.1);
				upLinkEARFCN[i] = 65136 + downLinkEARFCN[i];
				upLinkFrequency[i] = 1710+(i*.1);
			}
		}
		if (bandClass == 69)
		{
			downLinkEARFCN = new int[500];
			upLinkEARFCN = new int[500];
			downLinkFrequency = new double[500];
			upLinkFrequency = new double[500];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+67836;
				downLinkFrequency[i] = 2570 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 70)
		{
			downLinkEARFCN = new int[250];
			upLinkEARFCN = new int[250];
			downLinkFrequency = new double[250];
			upLinkFrequency = new double[250];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+68336;
				downLinkFrequency[i] = 1995 + (i*.1);
				upLinkEARFCN[i] = 64636 + downLinkEARFCN[i];
				upLinkFrequency[i] = 1695+(i*.1);
			}
		}
		if (bandClass == 71)
		{
			downLinkEARFCN = new int[350];
			upLinkEARFCN = new int[350];
			downLinkFrequency = new double[350];
			upLinkFrequency = new double[350];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+68586;
				downLinkFrequency[i] = 617 + (i*.1);
				upLinkEARFCN[i] = 64536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 663+(i*.1);
			}
		}
		if (bandClass == 72)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+68936;
				downLinkFrequency[i] = 461 + (i*.1);
				upLinkEARFCN[i] = 64536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 451+(i*.1);
			}
		}
		if (bandClass == 73)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+68986;
				downLinkFrequency[i] = 460 + (i*.1);
				upLinkEARFCN[i] = 64536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 450+(i*.1);
			}
		}
		if (bandClass == 74)
		{
			downLinkEARFCN = new int[430];
			upLinkEARFCN = new int[430];
			downLinkFrequency = new double[430];
			upLinkFrequency = new double[430];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+69036;
				downLinkFrequency[i] = 1475 + (i*.1);
				upLinkEARFCN[i] = 64536 + downLinkEARFCN[i];
				upLinkFrequency[i] = 1427+(i*.1);
			}
		}
		if (bandClass == 75)
		{
			downLinkEARFCN = new int[850];
			upLinkEARFCN = new int[850];
			downLinkFrequency = new double[850];
			upLinkFrequency = new double[850];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+69466;
				downLinkFrequency[i] = 1432 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 76)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+70316;
				downLinkFrequency[i] = 1427 + (i*.1);
				upLinkEARFCN[i] = downLinkEARFCN[i];
				upLinkFrequency[i] = downLinkFrequency[i];
			}
		}
		if (bandClass == 85)
		{
			downLinkEARFCN = new int[180];
			upLinkEARFCN = new int[180];
			downLinkFrequency = new double[180];
			upLinkFrequency = new double[180];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+70366;
				downLinkFrequency[i] = 728 + (i*.1);
				upLinkEARFCN[i] = 63636 + downLinkEARFCN[i];
				upLinkFrequency[i] = 698+(i*.1);
			}
		}
		if (bandClass == 87)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+70546;
				downLinkFrequency[i] = 420 + (i*.1);
				upLinkEARFCN[i] = 63636 + downLinkEARFCN[i];
				upLinkFrequency[i] = 410+(i*.1);
			}
		}
		if (bandClass == 88)
		{
			downLinkEARFCN = new int[50];
			upLinkEARFCN = new int[50];
			downLinkFrequency = new double[50];
			upLinkFrequency = new double[50];
			for (int i = 0; i < upLinkFrequency.length; i++)
			{
				downLinkEARFCN[i] = i+70596;
				downLinkFrequency[i] = 422 + (i*.1);
				upLinkEARFCN[i] = 63636 + downLinkEARFCN[i];
				upLinkFrequency[i] = 412+(i*.1);
			}
		}
		return 0;
	}
}

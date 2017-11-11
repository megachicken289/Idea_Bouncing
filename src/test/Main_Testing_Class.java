import com.AllPossibleCombos.Combo_AutoUnlock;
import com.AllPossibleCombos.Start_AllPossCombos;
import com.Cmn_Mods.Get_Constants_Vars;
import com.Data_Validation_Program.DVP_Main;
import com.Quick_Projects.Martyr2_Projects;

/**
 * Created by Frank Borges XPTHQ on 10/24/2017.
 */
public class Main_Testing_Class
{
	public static void main (String[] args)
	{
		DVP_Main dvpM = new DVP_Main();
		Martyr2_Projects m2p = new Martyr2_Projects();
		Get_Constants_Vars consts = new Get_Constants_Vars();
		Start_AllPossCombos apc = new Start_AllPossCombos();
		Combo_AutoUnlock cau = new Combo_AutoUnlock();
		//dvpM.DVP_Setup();
		
		cau.Test_Lock();

		apc.APC_Setup();

		for (int i = 0; i<consts.getConstArrItems().length; i++) {
			m2p.Reverse_A_String(consts.getConstArrItems()[i]);
		}
//		m2p.Pig_Latin(consts.getConstArrSent()[0]);
		for (int i = 0; i<consts.getConstArrItems().length; i++) {
			m2p.Pig_Latin(consts.getConstArrItems()[i]);
		}
		for (int i = 0; i<consts.getConstArrSent().length; i++) {
			m2p.Pig_Latin(consts.getConstArrSent()[i]);
		}
		for (int i = 0; i<consts.getConstArrSent().length; i++) {
			m2p.Count_Vowels(consts.getConstArrSent()[i]);
		}
		for (int i = 0; i<consts.getConstArrItems().length; i++) {
			m2p.Check_For_Palidrome(consts.getConstArrItems()[i]);
		}
		for (int i = 0; i<consts.getConstArrSent().length; i++) {
			m2p.Check_For_Palidrome(consts.getConstArrSent()[i]);
		}
		for (int i = 0; i<consts.getConstArrItems().length; i++) {
			m2p.Count_Words_In_String(consts.getConstArrItems()[i]);
		}
		for (int i = 0; i<consts.getConstArrSent().length; i++) {
			m2p.Count_Words_In_String(consts.getConstArrSent()[i]);
		}
		
		dvpM.DVP_Setup();
	}
}

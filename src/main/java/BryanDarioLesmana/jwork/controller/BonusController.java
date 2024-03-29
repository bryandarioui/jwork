package BryanDarioLesmana.jwork.controller;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import BryanDarioLesmana.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
/** inisiasi class */
public class BonusController {
    @RequestMapping("")
    /**
     * getter all bonus
     */
    public ArrayList<Bonus> getAllBonus(){
        ArrayList<Bonus> bonus = null;
        bonus = DatabaseBonus.getBonusDatabase();
        return bonus;
    }
    /**
     * getter dengan referral code
     * @param referralCode referralCode
     * @return bonus
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByReferralCode(referralCode);
        return bonus;
    }
    /**
     * method untuk menambah bonus kode
     * @param referralCode sebagai referral code
     * @param extraFee untuk ekstra gaji
     * @param minTotalFee untuk gaji minimal
     * @param active untuk status bonus code
     * @return bonus yang telah dibuat
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value="referralCode") String referralCode,
                          @RequestParam(value="extraFee") int extraFee,
                          @RequestParam(value="minTotalFee") int minTotalFee,
                          @RequestParam boolean active)
            throws ReferralCodeAlreadyExistsException{
        Bonus bonus = new Bonus(DatabaseBonus.getLastId()+1, "test", minTotalFee, extraFee, active);
        if (DatabaseBonus.addBonus(bonus)){
            return bonus;
        }
        else{
            return null;
        }
    }
}

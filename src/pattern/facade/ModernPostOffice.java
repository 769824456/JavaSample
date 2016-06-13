package pattern.facade;

/**
 * Created by yulongsun on 2016/5/16.
 */
public class ModernPostOffice {

    private LetterProcessImpl letterProcess = new LetterProcessImpl();

    //写信，封装，投递，一体化了
    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);

        letterProcess.fillEnvelope(address);

        letterProcess.letterIntoEnvelope();

        letterProcess.sendLetter();
    }
}

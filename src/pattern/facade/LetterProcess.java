package pattern.facade;

/**
 * Created by yulongsun on 2016/5/16.
 * 定义一个写信的过程
 */
public interface LetterProcess {

    /*写信内容*/
    void writeContext(String context);

    /*封装信封*/
    void fillEnvelope(String address);

    /*把信放到信封里面*/
    void letterIntoEnvelope();

    /*邮递*/
    void sendLetter();
}

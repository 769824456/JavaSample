package rsa;


import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by yulongsun on 2016/4/25.
 */
public class RsaSample {

    private static String src = "yulongsun";

    public static void main(String[] args) {
        jdkRsa();
    }

    private static void jdkRsa() {
        try {
            //1.初始化密钥
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(512);
            KeyPair keyPair = keyPairGenerator.generateKeyPair(); //Pair:对

            RSAPublicKey  rsaPublicKey  = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
            System.out.println("Public Key:\n" + Base64.encode(rsaPrivateKey.getEncoded()));
            System.out.println("Private Key:\n" + Base64.encode(rsaPublicKey.getEncoded()));

            //2.私钥加密，公钥解密--加密
            long   begin      = System.nanoTime();
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
            KeyFactory          keyFactory          = KeyFactory.getInstance("RSA");
            PrivateKey          privateKey          = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            Cipher              cipher              = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);
            byte[] result = cipher.doFinal(src.getBytes());
            long   end      = System.nanoTime();
            System.out.println("encode time="+(end-begin));
            System.out.println("私钥加密，公钥解密--加密==" + Base64.encode(result));

            //私钥加密，公钥解密--解密
            long   deBegin      = System.nanoTime();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(rsaPublicKey.getEncoded());
//            KeyFactory         rsa               = KeyFactory.getInstance("RSA");

            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            cipher.init(Cipher.DECRYPT_MODE, publicKey);
            byte[] resultSrc = cipher.doFinal(result);
            long   deEnd      = System.nanoTime();
            System.out.println("decode time="+(deEnd-deBegin));
            System.out.println("私钥加密，公钥解密--解密==" + new String(resultSrc));


            //3.公钥加密，私钥解密 --加密
            X509EncodedKeySpec x509EncodedKeySpec1 = new X509EncodedKeySpec(rsaPublicKey.getEncoded());
            PublicKey          publicKey1          = keyFactory.generatePublic(x509EncodedKeySpec1);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey1);
            byte[] publicResult = cipher.doFinal(src.getBytes());
            System.out.println("公钥加密，私钥解密 --加密:" + Base64.encode(publicResult));

            //公钥加密，私钥解密--解密

            PKCS8EncodedKeySpec pkcs8EncodedKeySpec1 = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
            PrivateKey          privateKey1          = keyFactory.generatePrivate(pkcs8EncodedKeySpec1);
            cipher.init(Cipher.DECRYPT_MODE,privateKey1);
            byte[] privateSrc = cipher.doFinal(publicResult);
            System.out.println("公钥加密，私钥解密--解密:"+new String(privateSrc));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

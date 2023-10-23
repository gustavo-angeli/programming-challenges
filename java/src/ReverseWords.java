import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String s) {
        List<String> wordsList = new ArrayList<>(Arrays.stream(s.split(" ")).toList());
        Collections.reverse(wordsList);

        List<String> noBlankWordsList = new ArrayList<>();

        wordsList.forEach(w -> {
            if (!w.isBlank()) {
                noBlankWordsList.add(w);
            }
        });

        return noBlankWordsList.toString().replaceAll("[,\\[\\]]", "");
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
//        String string = reverseWords("6  AqYW1did  1KiIoD gRbjqABmT       20GqwXAIS      Euho2gMKWP      pTry4LPt kBzo pdI   zOQ       BvAp ZpHqb     EO Zl      9lzbUfLAI  8v  ECdN2  yqiAn       CTnwGYvL     dcZMax     Istwr       IuwTsm5l       JKXOb7   EJGHv   QRgvc  U       S      H       F      Ay3wk    v5BTak6W    JsEa5MhiZi     cuQHW   u     1UQM0OJX       JqE2UD       lWGytIj       uv38      7GNcL9PN   Noa8onN9EX dZ      C   iVBMK0Lb     Ns   Nxd3t       RWBFvDjFI    cOs0q    0SJeg1BOU5 CBAvB40    cB0AyDTkv       hXI2ua    XPXpsigAU       AKtuc9     VGj   xK    z   mvN      fOd  yRB  0YX8TNU       0hc6ZnQCdM       29jRtQqm   vc9JXbJ       EUql    rPtCjjcZ   AGtJpyM4      K     Ir6UfbhYi1 RN5    Z9   ZGyzo  v      9o5skFCDgl       UdNAibft   AYSH9DYW     XhzmQb8X7       R  R3Vpps  oKjtaVSuc  ECRnHKk2YB     eXVAumTcr    NG2f S8br2YIMeh  C1jqUSXFi     SZGaey     1SvE0ycNIx    BbNA4      0b     Tj       Fo     EF6t0akH      1Ks9kJQ4gc gU       cLDOpax      idHKEq7      f   WBJ3      eFM7Neqh6c      UD    Gj8O3      9f8Q3 s  ZobYa   KADj   u9SGTbz   ca5Opd3CR  yY1zJpg bHRZIMjh37      Vnzc fXzsG6x  AzgBLBhiH       Be2QNqc       cRI    MWrK  pugIE  zI8nsSS IXg DrbxMK5loS       1zY    Ms5U9  mdMsxRbJ     Oy29YBiyR    SJyNd     JA      b    E     WVR       f0pgY2GtQ   fQKO   9AW0MmegP     S     pqvq8mu      Qy       iFAqR    VjlZ1Nu23  5zLrU4P 1hRC1A     X     XXfUSb       hvv 3j33g KWYqhq  G0Rk qcft6    hdaMh0   hC3LV   VyF46ezgb    djnVlnFfob    m9IdV92Lu8      vW9ZFy8t3b  ox      qbxNTZwwO     puZB  XYgn     7sXqXGON SS      SDHxD0YfLa       nkbxR4u     WqD       NgmVlQuBj    lBg     v    Rfob      Ges2blc 9d       qa4XgIf       oH0z       G     ntV5    6  Sfr30rVE   m K  89uHIuJDP       ALyt      5whnq8Ed nGN39PU ko9QmRTD2    TJXsb      myx      q6nuoLg     fa     kNZ2AiZh  oSjLSypG6      LrtGwG3 ewK3Ti  E      zOBehCzOI    2MakPV4uEJ  Hn4QO  Iy  nNmkFEp    HQSr  t4b  ovUfST  DhlbXgHLe     G2V    CZ9Au      gPPXP  D54 te1kvLfkq       JgRwb2y 0lVq35N0       R  Ai       KK9KAdbb6     yg3DGZGpFb   k      TL1eLS       8e     yLMIIg      SfaQe  H0BG8    Uis       6K    JYmg0n3t6  yVKnbe4gL   2oqcYqu     SeE9c   yvK       qNG5 JQ8y64L9Jm     y3x8ni4E    u2aiaF8yU       uE9      sCX  J8ktdulkf   MuSxxlX     LTG01w7J       9J1eSPVfK    aNbxvoI   Tl0g3fiN1x      6Lc77       d1c cpIAv    zHeYF    RDbG6GX     Jul 7GTzgQ3   DOB8i2k   j Q  N84Uv     KZvM      ms01       8wt uEfGJ0lr       QYbY3bZ       ovp      LhcFeEoK    BJpO1YX      ASGGw3  y       JC      LoQ   SrDpUjPw6     3iZOj ALwpbtw   c7JmQmp0UA Ipw7     zxD0Y0D srdB0hSFj   2akIsolDeg      RNMfX9     bY     1l NT45    e  5lz      cqM1     Kglk     FhO73pu     I  OkO2aCGwf   q9E8  1G     Hjmq8it n5ZzU  PUge  V4WNx     3d3qCC      Fm  h2WYoqw  l1wx 4Ca2G1W Tf       c5K 4XQ2hYw  eKwTAzD9      VGemIgvp65 e    UvjuddRCi   s W8K    k1      Egp1H4AX      OWUqTwZt TA    bv8M0K6RI      ddXrQCd   6RY8g     5eGby0Iyao   YePZ3cCM     A882e   kbQ79HhC2p       9g     LLTEb g2p  YmFMh823u  XmB41GY76 RwWaL      4jXx  5olPlCC   1    J5mvzgRP3    ipLjWt     Qaq     1m    9T   Pg    ls  7XF3  TZU7hXn  8qO3BGWkHs    0qugrkRtDc       8       oDMws      jQQdH2Q       CWwraLGq   oQ43zZaqd       gTP8      c  B6v       KufNkSGAj ZLKQ2UZOoE NW3Yg15XZ   yN3      VdSEb5b6   8IVoW9AGU     fQWmapT Vqrq37dEyj    g08pm       zbd      q9rtaZ8KhB   jEyveYLBtX    ohtmWjJQ      Ckvr xsBeK   e  qAG8     P44ph4373N    3Tn0E     Z      YbdDRy8DJ      F    5XcF9       ESTpbHcS  DVBh4jUa       SlAoTYX     GnnGHwNU  3fAIS      33fJf     taN4snB      WrCSKdEj   LLmA0F2P OwB");
//        System.out.println(string.equals("OwB LLmA0F2P WrCSKdEj taN4snB 33fJf 3fAIS GnnGHwNU SlAoTYX DVBh4jUa ESTpbHcS 5XcF9 F YbdDRy8DJ Z 3Tn0E P44ph4373N qAG8 e xsBeK Ckvr ohtmWjJQ jEyveYLBtX q9rtaZ8KhB zbd g08pm Vqrq37dEyj fQWmapT 8IVoW9AGU VdSEb5b6 yN3 NW3Yg15XZ ZLKQ2UZOoE KufNkSGAj B6v c gTP8 oQ43zZaqd CWwraLGq jQQdH2Q oDMws 8 0qugrkRtDc 8qO3BGWkHs TZU7hXn 7XF3 ls Pg 9T 1m Qaq ipLjWt J5mvzgRP3 1 5olPlCC 4jXx RwWaL XmB41GY76 YmFMh823u g2p LLTEb 9g kbQ79HhC2p A882e YePZ3cCM 5eGby0Iyao 6RY8g ddXrQCd bv8M0K6RI TA OWUqTwZt Egp1H4AX k1 W8K s UvjuddRCi e VGemIgvp65 eKwTAzD9 4XQ2hYw c5K Tf 4Ca2G1W l1wx h2WYoqw Fm 3d3qCC V4WNx PUge n5ZzU Hjmq8it 1G q9E8 OkO2aCGwf I FhO73pu Kglk cqM1 5lz e NT45 1l bY RNMfX9 2akIsolDeg srdB0hSFj zxD0Y0D Ipw7 c7JmQmp0UA ALwpbtw 3iZOj SrDpUjPw6 LoQ JC y ASGGw3 BJpO1YX LhcFeEoK ovp QYbY3bZ uEfGJ0lr 8wt ms01 KZvM N84Uv Q j DOB8i2k 7GTzgQ3 Jul RDbG6GX zHeYF cpIAv d1c 6Lc77 Tl0g3fiN1x aNbxvoI 9J1eSPVfK LTG01w7J MuSxxlX J8ktdulkf sCX uE9 u2aiaF8yU y3x8ni4E JQ8y64L9Jm qNG5 yvK SeE9c 2oqcYqu yVKnbe4gL JYmg0..."));
    }

}

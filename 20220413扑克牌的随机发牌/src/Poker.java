import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
//真难
class Card {//每一张扑克
    private String flower;
    private int rank;

    public Card(String flower, int rank) {//构造方法花色和点数
        this.flower = flower;
        this.rank = rank;
    }

    @Override
    public String toString() {//打印
        return "[ "+this.flower+":"+this.rank+" ]";
    }
}

public class Poker {
    private static final String[] flowers = {"♣", "♦", "♥", "♠"};

    public static List<Card> getCard() {//构造一组扑克牌的方法
        ArrayList<Card> cards = new ArrayList<>();//用Arraylist来实现扑克牌
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String flower = flowers[i];
                int rank = j;
                Card card = new Card(flower,rank);
                cards.add(card);//将一张牌添加到牌组cards中
            }
        }
        return cards;
    }

    public static void swap(List<Card> cards,int i, int j) {//交换i,j两张牌的位置
        Card tmp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,tmp);
    }

    public static void shuffle(List<Card> cards) {//洗牌从最后一张依次往前交换随机位置
        int size = cards.size();
        for (int i = size - 1; i > 0; i--) {
            Random random = new Random();
            int rand = random.nextInt(i);//出错点
            swap(cards,i,rand);
        }
    }

    public static void main(String[] args) {
        List<Card> cards= getCard();
        System.out.println("生成牌:"+cards);
        shuffle(cards);
        System.out.println("洗牌:"+cards);
        ArrayList<List<Card>> Man = new ArrayList<>();
        List<Card> Man1 = new ArrayList<>();
        List<Card> Man2 = new ArrayList<>();        
        List<Card> Man3 = new ArrayList<>();
        Man.add(Man1);
        Man.add(Man2);
        Man.add(Man3);
        for (int i = 0; i < 5; i++) {//三个人每人轮流抽一张牌
            for (int j = 0; j < 3; j++) {
                Card card = cards.remove(0);//每次抽顶上那张牌相当于把他删掉，下一次还是顶上的那张牌
                Man.get(j).add(card);
            }
        }
        System.out.println("Man1:" + Man1);
        System.out.println("Man2:" + Man2);
        System.out.println("Man3:" + Man3);
        System.out.println("剩下:"+ cards);
    }
}
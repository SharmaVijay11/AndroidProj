package kz.caremet.mentors.vijaysproject;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Calendar;

import kz.caremet.mentors.vijaysproject.models.FootballNews;

class FootballNewsGenerator {

    ArrayList<FootballNews> footballNewsList;

    private static FootballNewsGenerator instance;

    private FootballNewsGenerator(){}

    static FootballNewsGenerator getInstance(){
        if(instance != null){
            return instance;
        }
        else{
            instance = new FootballNewsGenerator();
            instance.footballNewsList = new ArrayList<>();
            for (int i = 0; i< 1000; i++){
                instance.footballNewsList.add(
                        new FootballNews(
                                i,
                                "Зидан знал о плохом самочувствии Куртуа, но поставил его на матч с «Брюгге»",
                                "Поставив Куртуа на матч с Брюгге Зизу принял неоднозначное решение, о котором наверняка пожалел.",
                                "«Реал» горел «Брюгге» 0:2 в матче Лиги чемпионов, и в перерыве Зидан поменял Куртуа на Альфонса Ареола. Изначально казалось, что проблема была в ужасной игре кипера, но позже выяснилось, что у игрока возникли проблемы со здоровьем \n " +
                                        "Правда, начались они еще до матча, и Зидан об этом знал, но все равно выставил бельгийца в основе, сообщает Mundo Deportivo. Тибо еще утром в день игры почувствовал недомогание и проблемы с желудком, но выразил желание участвовать в матче. Зизу пошел на поводу у игрока, который пропустил два сомнительных мяча за 45 минут.\n" +
                                        "\n" +
                                        "Ранее сообщалось, что после матча кипер не мог самостоятельно управлять авто, и до дома его подвез отец.\n" +
                                        "\n" +
                                        "«Реал» выпустил официальное заявление о состоянии здоровья бельгийца. Диагноз болезни Тибо – острый гастроэнтерит, но футболист уже идет на поправку. Никаких панических атак, о которых писали некоторые медиа, не было.\n" +
                                        "\n" +
                                        "Матч с «Брюгге» завершился ничьей – 2:2.\n" +
                                        "«Реал» возглавляет таблицу Ла Лиги.",
                                "https://i.eurosport.com/2019/10/01/2687863-55579570-2560-1440.jpg?w=1600",
                                Calendar.getInstance().getTime()
                        )
                );
            }
        }

        return instance;
    }

    ArrayList<FootballNews> getFootballNewsList(){
        return footballNewsList;
    }


    @Nullable
    FootballNews getFootballNews(int id){

        if(id<footballNewsList.size()){
            return footballNewsList.get(id);
        }
        return null;
    }

}

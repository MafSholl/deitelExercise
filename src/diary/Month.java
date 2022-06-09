package diary;

import static diary.Day.*;

public enum Month {
    January(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    February(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    March(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    April(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    May(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    June(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    July(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    August(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    September(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    October(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    Novermber(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday),
    December(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday);

    private Day[] days;

    Month(Day... days){
        this.days = days;
    }
}

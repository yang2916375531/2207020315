data class News(
    val id: Int,
    val name:String,
    val title:String,
    val number:Int,
    val content:String
)
data class Novel(
    val id: Int,
    val name:String,
    val classification: String,
    val writer:String,
    val number:Int
)

object UserData{
    val NewsList = mutableListOf(
        News(1,"新闻一","公虾米",50066,"干饭"),
        News(2,"新闻二","打拼精神",10010000,"努力"),
        News(3,"新闻三","习大大访外",1000000,"友好交流"),
    )
    val NovelList = mutableListOf(
        Novel(1,"隐形的翅膀","生活潇洒","无名氏",1000000),
        Novel(2,"向我借钱","短篇小说","小阳哥",1000000),
        Novel(3,"风生水起","吹牛逼小说","哈哈哈哈",1000000),
    )
}
# SI_2022_lab2_203019

## Наце Ѓорѓиевски 203019

### Control Flow Graph
![Control Flow Graph](CFG.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 9, истата ја добив преку бројот на региони 9. Истиот број го добиваме и преку другите формули. Според формулата за предикати имаме 8 предикатни јазли + 1 = 9, а според формулата E-N+2 имаме 30-23+2 = 9.

### Тест случаи според критериумот Every statement
C0 може да се постигне со 3 тест случаи

прв случај: ако пратиме празна листа се изминуваат јазлите 1,2,21

втор случај: ако пратиме листа со 5 елементи се изминуваат јазлите 1,3,4,5,21

трет случај: ако ја пратиме листата ["0","#","0","#","0","#","0","#","#"] се изминуваат јазлите 1,3,4,6,7.1,7.2,7.3,8,9,10,11,12,13,14,15,16,17,18,19,20,21

Со овие три случаи се поминуваат сите јазли.

### Тест случаи според критериумот Every branch
C1 може да се постигне со 3 тест случаи

прв случај: ако пратиме празна листа се изминуваат гранките: 1-2, 2-21.

втор случај: ако пратиме листа со 5 елементи се изминуваат гранките: 1-3, 3-4, 4-5, 5-21.

трет случај: ако ја пратиме листата ["#","0","#","0","#","#","#","0","0"] се изминуваат гранките: 1-3, 3-4, 4-6, 6-7.1, 7.1-7.2, 7.2-20, 20-21, 7.2-8, 8-19, 19-7.3, 7.3-7.2, 8-9, 9-10, 10-11, 11-12, 12-14, 11-13, 13-14, 10-14, 14-15, 15-16, 14-16, 16-17, 17-18, 16-18, 18-7.3

Со овие три случаи се изминуваат сите гранки.

<h3>Ключевые теоретические и практические выдержки из книги  "Грокаем алгоритмы" А.Бхаргава</h3>
<hr>

* **Бинарный поиск** - алгоритм; на входе получает **остортированный список элементов**.  
(сложность алгоритма log2N - где N число элементов на входе.  
К примеру размер входного списка элементов
равен 128, отсюда максимально возможное количество проверок log2 128 = 7 ); 
* **"О-большое"** - описывает скорость работы алгоритма. Не сообщает скорость в секундах,  
а позволяет сравнить количество операций.  
"О-большое" указывает насколько быстро возрастает время выполнения
алгоритма с увеличением размера входных данных.   
Определяет время выполнения в худшем случае.
Время выполнения основных операций с массивами и списками:

|              | Массивы       | Связанные Списки  |   Хэш таблицы (средний случай)  | Хэш таблицы (худший случай) |
   | ------------- |:-------------:|:-----------------:|:--------:|:---------:|
   | Чтение        |      O(1)     |   O(n)            |  O(1)        |   O(n)    |
   | Вставка       |      O(n)     |   O(1) (только в тому случае если удается получить мгновенно к удаляемому элементу, т.е first and last). А так O(n)  | O(1) | O(n)  |
   | Удаление       |     O(n)     |   O(1) (только в тому случае если удается получить мгновенно к удаляемому элементу, т.е first and last) A так O(n)   | O(1) | O(n)|
   
* **Рекурсия** - функция, которая вызвает саму себя. В каждой рекурсивной функции д.б
два случая: базовый и рекурсивный.
* **Алгоритм быстрой сортировки** - использует стратегию "разделяй и властвуй". Основные этапы алгоритма:
    * выбрать опорный элемент
    * разделить массив на два подмассива: элементы меньшие опорного и элементы больше опорного
    * Рекурсивно применить быструю сортировку к двум подмассивам.
     
    Алгоритм уникален тем, что его скорость зависит от выбора опорного элемента.
    Быстрая сортировка быстрее сортировки слиянием (в среднем случае) поскольку временная константа у быстрой меньше,   
    несмотря на то, что оба алгоритма имееют одинаковую скорость. 
    В худшем случае время выполнения O(n2), в лучшем n*log(n) 
* **Граф** - моделирует набор связей. Каждый граф состоит из узлов и ребер.
В направленном графе отношения действуют в направлении стрелки. В не направленных, отношение идет в обе стороны.  
**Алгоритм поиска в ширину** основан на использовании графов. Он решает две задачи:  
    * существует ли путь из А в B
    * если существует, то поиск в ширину находит кратчайший путь.    
Время выполнения O(V+E)(V - количество вершин, E - количество ребер)
* **Алгоритм Дейкстры** - при работе с алгоритмом с каждым ребром графа связывается число, называемое **весом**.  
Граф с весами называется **взвешенным** графом. Граф без весов называется **невзвешенным** графом.   Для
вычисления кратчайшего пути в невзвешенном графе используется поиск в ширину. Кратчайшие пути во взвешенном графе вычисляются 
по алгоритму Дейкстры. Алгоритм Дейкстры работает только с **направленными ациклическими графами(DAG-Directed Acyclic Graph)**  
Алгоритм состоит из 4 шагов:
    * найти узел с наименьшей стоимостью.
    * проверить, существует ли более дешевый путь к соседям этого узла, и если существует, обновить их стоимости.
    * повторять, пока это не будет сделано для всех узлов графа
    * вычислить итоговый путь    
    
Алгоритм Дейкстры не может использоваться при наличии ребер, имеющих отрицательный. вес.
* **Динамическое программирование** - применяется при оптимизации некоторой характеристики при заданных ограничениях.  
(к примеру в задаче о рюкзаке максимизировать стоимость отобранных предеметов с ограничениями по емкости рюкзака).  
    * Динамическое программирование работает только в ситуациях, в которых задача может быть разбита на автономные подзадачи,  
не зависящие друг от друга.
    * В каждом решении из области динамического программирования строится таблица
    * значения ячеек таблицы обычно соответствуют оптимизируемой характеристике (для задачи о рюкзаке - общая стоимость товаров)
    * каждая ячейка представляет подзадачу, => необходимо определить как разбить задачу на подзадачи. 
    * не существует единой формулы для вычисления решений методом динамического программирования.
    


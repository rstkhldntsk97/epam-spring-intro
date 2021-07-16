Spring_1 Intro & Core

Annotation-based configuration and Spring Dependency Injection



Підготувати різні POJO класи з анотацією @Component, які розміщені в 3х різних пекеджах:

beans1 (біни: BeanA, BeanB, BeanC),

beans2 (біни: RoseFlower, CatAnimal, NarcissusFlower),

beans3 (біни: BeanD, BeanE, BeanF).

Створити 2ва файли конфігурації @Configuration.

Перша @Configuration проводить скан компонентів в пекіджі beans1.

Друга @Configuration сканує усі компоненти з beans2, а з beans3 вибирає лише BeanD та BeanF.

В окремому пекеджі створити біни OtherBeanA, OtherBeanB, OtherBeanC з анотацією @Component.

Створити біни, які будуть вприскувати біни з п.5 за допомогою @Autowired в:

конструктор

сеттери

поля

Для деяких з них використати @Qualifier.

Створити декілька бінів, які реалізовують певний інтерфейс. Створити бін,  що буде містити колекцію для створених бінів, які є впорядковані з використанням @Order.

Для п.7 один з бінів позначити @Primary, і вприснути ці біни в новий бін як об’єкти цього інтерфейсу, один з них як основний, а решта по @Qualifier.

Вивести конфігурацію усіх бінів на екран з використанням ApplicationContext. 
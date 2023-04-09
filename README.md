# Домашнее задание к семинару №6 курса "Объектно-ориентированное программирование"

### Задание: Cоздать систему управления складом (SOLID)

- **S - Single Responsibility Principle:**
    класс Product отвечает только за хранение информации о товаре
- **O - Open-Closed Principle**
    класс Supplier открыт для расширения, но закрыт для изменения
- **L - Liskov Substitution Principle**
    класс Director наследует класс Employee и может выполнять его функционал 
    плюс имеет дполнительно свой собственный
- **I - Interface Segregation Principle**
    класс Warehouse имплементирует два интерфейса. интерфейс Searcgable позволяет 
    выполнять поиск по разным запросам, интерфейс WarehouseOperation - производить
    операции над товаром (добавлять, удалять, менять)
- **D - Dependency Inversion Principle**
    классы FragilePacking и NotFragilePacking используют интерфейс Packing, 
    по разному реализуя упаковку товара в зависимости от категории

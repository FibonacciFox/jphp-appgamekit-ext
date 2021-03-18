# Список методов в категории Maths:
## SetVector3
### Описание
Заполняет указанный вектор.
### Определение
```php
void agk::SetVector3( UINT vectorID, float x, float y, float z )
```
### Параметры
```php
vectorID - Идентификатор вектора
x - x компонент вектора
y - Компонент y вектора
z - z компонент вектора
```
### Пример кода
---
## GetVector3Z
### Описание
Получает z из вектора.
### Определение
```php
float agk::GetVector3Z( UINT vectorID )
```
### Параметры
```php
vectorID - идентификатор вектора
```
### Пример кода
---
## GetVector3Y
### Описание
Получает y из вектора.
### Определение
```php
float agk::GetVector3Y( UINT vectorID )
```
### Параметры
```php
vectorID - идентификатор вектора
```
### Пример кода
---
## GetVector3X
### Описание
Получает x из вектора.
### Определение
```php
float agk::GetVector3X( UINT vectorID )
```
### Параметры
```php
vectorID - идентификатор вектора
```
### Пример кода
---
## GetVector3Multiply
### Описание
Умножает компоненты данного вектора на данный множитель
### Определение
```php
void agk::GetVector3Multiply( UINT resultVec, float multiplier )
```
### Параметры
```php
resultVec - ИДЕНТИФИКАТОР вектора для умножения.
multiplier - плавающее значение для умножения.
```
### Пример кода
---
## GetVector3Length
### Описание
Возвращает длину вектора
### Определение
```php
float agk::GetVector3Length( UINT vectorID )
```
### Параметры
```php
vectorID - Идентификатор вектора
```
### Пример кода
---
## GetVector3Distance
### Описание
Возвращает расстояние между 2 векторами.
### Определение
```php
float agk::GetVector3Distance( UINT vectorU, UINT vectorV )
```
### Параметры
```php
vectorU - Идентификатор первого вектора
vectorV - Идентификатор второго вектора
```
### Пример кода
---
## GetVector3Cross
### Описание
Заполняет результирующий вектор перекрестным произведением 2 переданных векторов.
### Определение
```php
void agk::GetVector3Cross( UINT resultVec, UINT vectorU, UINT vectorV )
```
### Параметры
```php
resultVec - ИДЕНТИФИКАТОР вектора для результатов
vectorU - Идентификатор первого вектора
vectorV - Идентификатор второго вектора
```
### Пример кода
---
## GetVector3Dot
### Описание
Возвращает точечное произведение 2 векторов
### Определение
```php
float agk::GetVector3Dot( UINT vectorU, UINT vectorV )
```
### Параметры
```php
vectorU - Идентификатор первого вектора
vectorV - Идентификатор второго вектора
```
### Пример кода
---
## GetVector3Add
### Описание
Заполняет вектор resultVec суммой вектора resultVec и вектора addVec.
### Определение
```php
void agk::GetVector3Add( UINT resultVec, UINT addVec )
```
### Параметры
```php
resultVec - ИДЕНТИФИКАТОР вектора для добавления и удержания результатов.
addVec - ИДЕНТИФИКАТОР вектора для добавления.
```
### Пример кода
---
## DeleteVector3
### Описание
Удаляет вектор
### Определение
```php
void agk::DeleteVector3( UINT vectorID )
```
### Параметры
```php
vectorID - Идентификатор вектора
```
### Пример кода
---
## CreateVector3
### Описание
Создает вектор и заполняет его переданными значениями. Возвращает идентификатор вектора
### Определение
```php
int agk::CreateVector3( float x, float y, float z )
int agk::CreateVector3()
```
### Параметры
```php
x - x компонент вектора
y - Компонент y вектора
z - z компонент вектора
```
### Пример кода
---
# Список методов в категории 3DPhysics:
## Update3DPhysicsPickJoint
### Описание
Устанавливает новое положение соединения кирки.
### Определение
```php
void agk::Update3DPhysicsPickJoint( UINT jointID, int positionVec3 )
```
### Параметры
```php
jointID - Id соединения
positionVec3 - Идентификатор вектора положения
```
### Пример кода
---
## Step3DPhysicsWorld
### Описание
Вызовите перед командой Sync() в нижней части цикла. Это шагнет в мир физики. Сохраняет физику постоянной независимо от частоты кадров. Не вызывая эту команду, вы приостановите действие физического мира.
### Определение
```php
void agk::Step3DPhysicsWorld()
```
### Параметры
```php
```
### Пример кода
---
## SphereCast3DPhysicsObject
### Описание
Отбрасывает форму столкновения сфер по длине луча. Возвращает 1, если указанный объект был поражен, и 0, если он не был поражен.
### Определение
```php
int agk::SphereCast3DPhysicsObject( UINT objID, UINT rayID, int fromVec3ID, int toVec3ID, float radius )
```
### Параметры
```php
objID - идентификатор объекта
rayID - Идентификатор луча, который возвращается вызовом Create3DPhysicsRay().
fromVec3ID - Идентификатор вектора, удерживающего начальную точку
toVec3ID - Идентификатор вектора, удерживающего конечную точку
radius - Радиус сферы
```
### Пример кода
---
## SphereCast3DPhysics
### Описание
Отбрасывает форму столкновения сфер по длине луча.
### Определение
```php
void agk::SphereCast3DPhysics( UINT rayID, int fromVec3ID, int toVec3ID, float radius )
```
### Параметры
```php
rayID - Идентификатор луча, который возвращается вызовом Create3DPhysicsRay().
fromVec3ID - Идентификатор вектора, удерживающего начальную точку
toVec3ID - Идентификатор вектора, удерживающего конечную точку
radius - Радиус сферы
```
### Пример кода
---
## Stand3DPhysicsCharacterController
### Описание
Стоит контроллер
### Определение
```php
void agk::Stand3DPhysicsCharacterController( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## SetObjectShapeStaticPolygon
### Описание
Устанавливает форму столкновения объектов в статическую треугольную сетку на основе размера объекта. Объект становится статическим объектом треугольная сетчатая форма не может быть динамической. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeStaticPolygon( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## SetObjectShapeSphere
### Описание
Задает форму столкновения в виде сферы в зависимости от размера объекта. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeSphere( UINT objID )
void agk::SetObjectShapeSphere( UINT objID, float diameter )
```
### Параметры
```php
objID - идентификатор объекта
diameter - размер сферы
```
### Пример кода
---
## SetObjectShapeCylinder
### Описание
Задает форму столкновения в виде цилиндра в зависимости от размера объекта. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeCylinder( UINT objID, int axis )
void agk::SetObjectShapeCylinder( UINT objID, int axis, float height, float diameter )
```
### Параметры
```php
objID - идентификатор объекта
axis - 0 =Ось X, 1 =ось Y, 2 = ориентация оси Z
height - высота по оси y
diameter - диаметр на x и z
```
### Пример кода
---
## SetObjectShapeConvexHull
### Описание
Устанавливает форму столкновения объектов на выпуклую оболочку в зависимости от размера объекта. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeConvexHull( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## SetObjectShapeCone
### Описание
Устанавливает форму столкновения в виде конуса на основе переданного размера. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена. Возвращает идентификатор фигуры.
### Определение
```php
void agk::SetObjectShapeCone( UINT objID, int axis, float height, float diameter )
void agk::SetObjectShapeCone( UINT objID, int axis )
```
### Параметры
```php
objID - идентификатор объекта
axis - 0 =Ось X, 1 =ось Y, 2 = ориентация оси Z
height - высота по оси y
diameter - диаметр на x и z
```
### Пример кода
---
## SetObjectShapeCompound
### Описание
Устанавливает форму столкновения объектов в составную форму, готовую к добавлению новых фигур. Объект должен быть динамическим.
### Определение
```php
void agk::SetObjectShapeCompound( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## SetObjectShapeCapsule
### Описание
Устанавливает форму столкновения в капсулу на основе переданного размера. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeCapsule( UINT objID, int axis, float sizeX, float sizeY, float sizeZ )
void agk::SetObjectShapeCapsule( UINT objID, int axis )
void agk::SetObjectShapeCapsule( UINT objID, int axis, UINT vectorID )
```
### Параметры
```php
objID - идентификатор объекта
axis - 0 =Ось X, 1 =ось Y, 2 = ориентация оси Z
sizeX - размер по оси x
sizeY - размер по оси Y
sizeZ - размер по оси Z
vectorID - Идентификатор вектора измерения.
```
### Пример кода
---
## SetObjectShapeBox
### Описание
Устанавливает форму столкновения в поле на основе переданного размера. Сначала вы должны создать физическое тело для объекта, иначе эта команда не будет выполнена.
### Определение
```php
void agk::SetObjectShapeBox( UINT objID, float sizeX, float sizeY, float sizeZ )
void agk::SetObjectShapeBox( UINT objID, UINT vectorID )
void agk::SetObjectShapeBox( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
sizeX - размер по оси x
sizeY - размер по оси Y
sizeZ - размер по оси Z
vectorID - Идентификатор вектора измерения
```
### Пример кода
---
## SetObject3DPhysicsSleepingThreshold
### Описание
Устанавливает пороги спящего режима 3d-физики для объекта.
### Определение
```php
void agk::SetObject3DPhysicsSleepingThreshold( UINT objID, float angular, float linear )
```
### Параметры
```php
objID - идентификатор объекта
angular - угловая скорость
linear - линейная скорость
```
### Пример кода
---
## SetObject3DPhysicsMaxLinearVelocity
### Описание
Это установит максимальную линейную скорость для динамического объекта. Это предотвратит движение объектов слишком быстро, чтобы их можно было увидеть на экране.
### Определение
```php
void agk::SetObject3DPhysicsMaxLinearVelocity( UINT objID, float maxLinearVelocity )
```
### Параметры
```php
objID - идентификатор объекта
maxLinearVelocity - максимальная скорость, которую может достичь объект.
```
### Пример кода
---
## SetObject3DPhysicsRollingFriction
### Описание
Это установит трение качения для статических и динамических объектов.
### Определение
```php
void agk::SetObject3DPhysicsRollingFriction( UINT objID, float friction )
```
### Параметры
```php
objID - идентификатор объекта
friction - величина трения качения в виде поплавка
```
### Пример кода
---
## SetObject3DPhysicsLinearVelocity
### Описание
Задает вектор линейной скорости объекта. Вектор направления автоматически нормализуется.
### Определение
```php
void agk::SetObject3DPhysicsLinearVelocity( UINT objID, UINT vectorID, float initialSpeed )
void agk::SetObject3DPhysicsLinearVelocity( UINT objID, float dirX, float dirY, float dirZ, float initialSpeed )
```
### Параметры
```php
objID - идентификатор объекта
vectorID - Идентификатор вектора направления
initialSpeed - начальная скорость.
dirX - X компонент вектора направления
dirY - компонент Y вектора направления
dirZ - Z-составляющая вектора направления
```
### Пример кода
---
## SetObject3DPhysicsMass
### Описание
Задает массу объекта
### Определение
```php
void agk::SetObject3DPhysicsMass( UINT objID, float mass )
```
### Параметры
```php
objID - идентификатор объекта
mass - масса объекта
```
### Пример кода
---
## SetObject3DPhysicsGroupAndMask
### Описание
Устанавливает группу столкновений объектов и маску. По умолчанию все физические объекты находятся в одной группе и не маскируются. Если вы используете группы столкновений и маски, вы должны использовать их для всех физических объектов в мире.
### Определение
```php
void agk::SetObject3DPhysicsGroupAndMask( UINT objID, int group, int mask )
```
### Параметры
```php
objID - идентификатор объекта
group - группа столкновений, к которой принадлежит и этот физический объект.
mask - группы столкновений, которые вы хотите замаскировать от столкновения.
```
### Пример кода
---
## SetObject3DPhysicsFriction
### Описание
Это установит трение для динамических и статических объектов
### Определение
```php
void agk::SetObject3DPhysicsFriction( UINT objID, float friction )
```
### Параметры
```php
objID - идентификатор объекта
friction - значение трения в виде поплавка
```
### Пример кода
---
## SetObject3DPhysicsDamping
### Описание
Устанавливает линейное и угловое демпфирование для объекта
### Определение
```php
void agk::SetObject3DPhysicsDamping( UINT objID, float linearDamp, float angularDamp )
```
### Параметры
```php
objID - идентификатор объекта
linearDamp - Величина линейного демпфирования, приложенного к объекту.
angularDamp - Величина углового демпфирования, приложенного к объекту.
```
### Пример кода
---
## SetObject3DPhysicsAnisotropicFriction
### Описание
Это позволит установить тип анизотропного трения.
### Определение
```php
void agk::SetObject3DPhysicsAnisotropicFriction( UINT objID, int type )
```
### Параметры
```php
objID - идентификатор объекта
type - DISABLED = 0, FRICTION = 1, ROLLING_FRICTION = 2
```
### Пример кода
---
## SetObject3DPhysicsRestitution
### Описание
Устанавливает реституционное трение для объекта. Вы можете установить Реституцию для динамических и статических объектов.
### Определение
```php
void agk::SetObject3DPhysicsRestitution( UINT objID, float friction)
```
### Параметры
```php
objID - идентификатор объекта
friction - Величина трения, приложенного к объекту.
```
### Пример кода
---
## SetObject3DPhysicsDeactivationTime
### Описание
Устанавливает время деактивации физического объекта. Это количество времени, которое физический объект ждет, когда он придет в состояние покоя, прежде чем он станет деактивированным.
### Определение
```php
void agk::SetObject3DPhysicsDeactivationTime( UINT objID, float time )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## SetObject3DPhysicsCanSleep
### Описание
Все динамические объекты автоматически переводятся в состояние покоя. Это остановит автоматическое погружение динамического объекта в спящий режим.
### Определение
```php
void agk::SetObject3DPhysicsCanSleep( UINT objID, int canSleep )
```
### Параметры
```php
objID - идентификатор объекта
canSleep - 1 = истина , 0 = ложь
```
### Пример кода
---
## SetObject3DPhysicsAngularVelocity
### Описание
Задает угловую скорость объекта. Вектор угла автоматически нормализуется.
### Определение
```php
void agk::SetObject3DPhysicsAngularVelocity( UINT objID, float angX, float angY, float angZ, float initialSpeed )
void agk::SetObject3DPhysicsAngularVelocity( UINT objID, UINT vectorID, float initialSpeed )
```
### Параметры
```php
objID - идентификатор объекта
angX - X компонент вектора угла
angY - компонент Y вектора угла
angZ - Z-составляющая вектора угла
initialSpeed - начальная скорость.
vectorID - Идентификатор вектора направления.
```
### Пример кода
---
## Set3DPhysicsTwistJointMotorRotationTarget
### Описание
Установите целевую скорость для твист-соединения. Должен быть вызван в цикле. Сначала включите соединение с Set3DPhysicsTwistJointMotorIsEnabled()
### Определение
```php
void agk::Set3DPhysicsTwistJointMotorRotationTarget( UINT jointID, int rotationVec3ID )
```
### Параметры
```php
jointID - Id соединения
rotationVec3ID - Идентификатор вектора, который имеет цель вращения для двигателя твист-сустава.
```
### Пример кода
---
## Set3DphysicsRagdollStatic
### Описание
Устанавливает статику тряпичной куклы, изменяя массу всех костей тряпичной куклы на ноль.
### Определение
```php
void agk::Set3DphysicsRagdollStatic( UINT objID, int isStatic )
```
### Параметры
```php
objID - идентификатор объекта
isStatic - 1 = истина, 0 = ложь
```
### Пример кода
---
## Set3DPhysicsTwistJointMotorIsEnabled
### Описание
Включает двигатель с твист-соединением.
### Определение
```php
void agk::Set3DPhysicsTwistJointMotorIsEnabled( UINT jointID, int isEnabled )
```
### Параметры
```php
jointID - идентификатор СОЕДИНЕНИЯ
isEnabled - 1 = истина , 0 = ложь
```
### Пример кода
---
## Set3DPhysicsTwistJointMaxMotorImpulse
### Описание
Устанавливает максимальное значение импульса двигателя для Твист-соединения. Сначала включите соединение с Set3DPhysicsTwistJointMotorIsEnabled()
### Определение
```php
void agk::Set3DPhysicsTwistJointMaxMotorImpulse( UINT jointID, float maxImpulse )
```
### Параметры
```php
jointID - Id соединения
maxImpulse - Максимальный импульс, который должен быть приложен к двигателю сустава.
```
### Пример кода
---
## Set3DPhysicsStaticPlaneRotation
### Описание
Задает вращение статической плоскости
### Определение
```php
void agk::Set3DPhysicsStaticPlaneRotation( UINT planeID, float angX, float angY, float angZ )
```
### Параметры
```php
planeID - статический идентификатор плоскости
angX - Угол вращения мира X.
angY - Угол поворота мира Y.
angZ - Угол поворота мира Z.
```
### Пример кода
---
## Set3DPhysicsSliderJointTargetLinearMotorVelocity
### Описание
Устанавливает целевую линейную скорость двигателя для физического ползункового соединения.
### Определение
```php
void agk::Set3DPhysicsSliderJointTargetLinearMotorVelocity( UINT jointID, float linearMotorVelocity )
```
### Параметры
```php
jointID - Id соединения
linearMotorVelocity - Линейная скорость, которая должна быть приложена к совместному двигателю.
```
### Пример кода
---
## Set3DPhysicsSliderJointPoweredLinearMotorIsEnabled
### Описание
Установите линейный двигатель с приводом от ползунковых соединений в положение включено.
### Определение
```php
void agk::Set3DPhysicsSliderJointPoweredLinearMotorIsEnabled( UINT jointID, int isEnabled )
```
### Параметры
```php
jointID - Id соединения
isEnabled - 1 = истина, 0 = ложь
```
### Пример кода
---
## Set3DPhysicsSliderJointMaxLinearMotorForce
### Описание
Устанавливает двигатель шарниров на максимальное линейное усилие.
### Определение
```php
void agk::Set3DPhysicsSliderJointMaxLinearMotorForce( UINT jointID, float maxLinearForce )
```
### Параметры
```php
jointID - Id соединения
maxLinearForce - Максимальная линейная сила, приложенная к шарнирному двигателю.
```
### Пример кода
---
## Set3DPhysicsRagdollSleepingThresholds
### Описание
Устанавливает пороги сна для создаваемой тряпичной куклы. Значения по умолчанию должны быть хороши для большинства ситуаций. Звоните только в том случае, если вы хотите изменить эти значения. Должен быть вызван до Finalize3DPhysicsRagDoll()
### Определение
```php
void agk::Set3DPhysicsRagdollSleepingThresholds( float linear, float angular )
```
### Параметры
```php
linear - Значение по умолчанию-1.8
angular - Значение по умолчанию-2.8
```
### Пример кода
---
## Set3DPhysicsRagdollDeactivationTime
### Описание
Устанавливает время деактивации создаваемой тряпичной куклы. Значения по умолчанию должны быть хороши для большинства ситуаций. Звоните только в том случае, если вы хотите изменить эти значения. Должен быть вызван перед Finalize3DPhysicsRagDoll()
### Определение
```php
void agk::Set3DPhysicsRagdollDeactivationTime( float time )
```
### Параметры
```php
time - Значение по умолчанию-0.8
```
### Пример кода
---
## Set3DPhysicsStaticPlanePosition
### Описание
Задает положение статической плоскости
### Определение
```php
void agk::Set3DPhysicsStaticPlanePosition( UINT planeID, float posX, float posY, float posZ )
```
### Параметры
```php
planeID - статический идентификатор плоскости
posX - Положение мира X.
posY - Положение в мире Y.
posZ - Положение мира Z.
```
### Пример кода
---
## Set3DPhysicsRagdollDeactivation
### Описание
Поддерживает физическую тряпичную куклу в активном состоянии. Не допускает автоматической деактивации, когда рэгдолл приходит в состояние покоя.
### Определение
```php
void agk::Set3DPhysicsRagdollDeactivation( UINT objID, int isDisabled )
```
### Параметры
```php
objID - идентификатор объекта
isDisabled - 1 = истина, 0 = ложь
```
### Пример кода
---
## Set3DPhysicsRagdollDamping
### Описание
Устанавливает демпфирование для создаваемой тряпичной куклы. Значения по умолчанию должны быть хороши для большинства ситуаций. Звоните только в том случае, если вы хотите изменить эти значения. Должен быть вызван перед Finalize3DPhysicsRagDoll()
### Определение
```php
void agk::Set3DPhysicsRagdollDamping( float linear, float angular )
```
### Параметры
```php
linear - Значение по умолчанию-0,08
angular - Значение по умолчанию-0.95
```
### Пример кода
---
## Set3DPhysicsRagdollBonesVisible
### Описание
Показывает объекты кости тряпичной куклы и скрывает объект.
### Определение
```php
void agk::Set3DPhysicsRagdollBonesVisible( UINT objID, int isVisible )
```
### Параметры
```php
objID - идентификатор объекта
isVisible - 1 = истина, 0 = ложь
```
### Пример кода
---
## Set3DPhysicsJointSliderLinearLimits
### Описание
Устанавливает линейные пределы для ползункового соединения. Чтобы разблокировать соединение, установите нижний предел больше верхнего.
### Определение
```php
void agk::Set3DPhysicsJointSliderLinearLimits( UINT jointID, float lowerLimit, float upperLimit )
```
### Параметры
```php
jointID - Id соединения
lowerLimit - Нижний предел
upperLimit - Верхний предел
```
### Пример кода
---
## Set3DPhysicsJointSliderAngularLimits
### Описание
Устанавливает угловые пределы для ползункового соединения. Чтобы разблокировать соединение, установите нижний предел больше верхнего.
### Определение
```php
void agk::Set3DPhysicsJointSliderAngularLimits( UINT jointID, float lowerLimit, float upperLimit )
```
### Параметры
```php
jointID - Id соединения
lowerLimit - Нижний предел в градусах
upperLimit - Верхний предел в градусах
```
### Пример кода
---
## Set3DPhysicsJointHingeLimits
### Описание
Устанавливает угловые пределы для шарнирного соединения в градусах. Чтобы разблокировать соединение, установите нижний предел больше верхнего.
### Определение
```php
void agk::Set3DPhysicsJointHingeLimits( UINT jointID, float minAng, float maxAng )
```
### Параметры
```php
jointID - Id соединения
minAng - Минимальный угол в градусах.
maxAng - Максимальный угол в градусах.
```
### Пример кода
---
## Set3DPhysicsJointEnabled
### Описание
Устанавливает порог разрушения соединения.
### Определение
```php
void agk::Set3DPhysicsJointEnabled( UINT jointID, int isEnabled )
```
### Параметры
```php
jointID - Id соединения
isEnabled - 0 отключит соединение
```
### Пример кода
---
## Set3DPhysicsJointConeTwistLimits
### Описание
Устанавливает угловые пределы для соединения закрутки конуса в градусах. Чтобы разблокировать определенное значение установите его на 360
### Определение
```php
void agk::Set3DPhysicsJointConeTwistLimits(  UINT jointID, float swingSpan1, float swingSpan2, float twistSpan )
```
### Параметры
```php
jointID - Id соединения
swingSpan1 - угол в градусах
swingSpan2 - угол в градусах
twistSpan - угол в градусах
```
### Пример кода
---
## Set3DPhysicsHingeJointMotorVelocity
### Описание
Установите целевую скорость для шарнирного соединения. Должен быть вызван в цикле. Сначала включите соединение с Set3DPhysicsHingeJointMotorIsEnabled()
### Определение
```php
void agk::Set3DPhysicsHingeJointMotorVelocity( UINT jointID, float targetVelocity )
```
### Параметры
```php
jointID - Id соединения
targetVelocity - Целевая скорость, которую нужно использовать.
```
### Пример кода
---
## Set3DPhysicsHingeJointMotorIsEnabled
### Описание
Включает мотор шарнирного соединения.
### Определение
```php
void agk::Set3DPhysicsHingeJointMotorIsEnabled( UINT jointID, int isEnabled )
```
### Параметры
```php
jointID - Id соединения
isEnabled - 1 = истина , 0 = ложь
```
### Пример кода
---
## Set3DPhysicsJointBreakingThreshold
### Описание
Устанавливает порог разрушения соединения.
### Определение
```php
void agk::Set3DPhysicsJointBreakingThreshold( UINT jointID, float breakThreshold )
```
### Параметры
```php
jointID - Id соединения
breakThreshold - пороговое значение разрыва
```
### Пример кода
---
## Set3DPhysicsHingeJointMaxMotorImpulse
### Описание
Устанавливает максимальное значение импульса двигателя для шарнирного соединения. Сначала включите соединение с Set3DPhysicsHingeJointMotorIsEnabled()
### Определение
```php
void agk::Set3DPhysicsHingeJointMaxMotorImpulse( UINT jointID, float maxImpulse )
```
### Параметры
```php
jointID - Id соединения
maxImpulse - Максимальное значение импульса, которое должно быть приложено к совместному двигателю.
```
### Пример кода
---
## Set3DPhysicsCharacterControllerStepHeight
### Описание
Устанавливает высоту, на которую контроллер может подниматься и опускаться.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerStepHeight( UINT objID, float stepHeight )
```
### Параметры
```php
objID - идентификатор объекта
stepHeight - Высота шага в мировых ценностях.
```
### Пример кода
---
## Set3DPhysicsGravity
### Описание
Устанавливает гравитацию мира физики, гравитация измеряется в метрах в секунду. По умолчанию гравитация установлена на ( 0.0, -10.0, 0.0 ). Вам нужно только вызвать эту команду, если вам нужно изменить настройки по умолчанию.
### Определение
```php
void agk::Set3DPhysicsGravity( float x, float y, float z )
void agk::Set3DPhysicsGravity( UINT vectorID )
```
### Параметры
```php
x - Величина силы тяжести по оси Х в метрах в секунду.
y - Величина силы тяжести по оси Y в метрах в секунду.
z - Величина силы тяжести по оси Z в метрах в секунду.
vectorID - Идентификатор вектора для использования
```
### Пример кода
---
## Set3DPhysicsCharacterControllerPosition
### Описание
Перемещает Контроллер в новые переданные координаты. Не размещайте контроллер внутри другого физического объекта.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerPosition( UINT objID, float posX, float posY, float posZ )
```
### Параметры
```php
objID - идентификатор объекта
posX - Новая координата X
posY - Новая координата Y
posZ - Новая координата Z
```
### Пример кода
---
## Set3DPhysicsCharacterControllerMaxSlope
### Описание
установите максимальный наклон в угловых градусах, на которые может подняться контроллер.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerMaxSlope( UINT objID, float maxSlopeDegress )
```
### Параметры
```php
objID - идентификатор объекта
maxSlopeDegress - Значение по умолчанию-45,0 градуса.
```
### Пример кода
---
## Set3DPhysicsCharacterControllerJumpSpeed
### Описание
Установите скорость, с которой контроллер перемещается вверх при вызове прыжка.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerJumpSpeed( UINT objID, float jumpSpeed )
```
### Параметры
```php
objID - идентификатор объекта
jumpSpeed - Значение по умолчанию-10.0
```
### Пример кода
---
## Set3DPhysicsCharacterControllerGravity
### Описание
Устанавливает гравитацию для контроллера символов. Эта гравитация не то же самое, что физическая мировая гравитация. и влияет только на индивидуальный характер контроллера.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerGravity( UINT objID, float gravity )
```
### Параметры
```php
objID - идентификатор объекта
gravity - Значение по умолчанию равно (9,8 * 3)
```
### Пример кода
---
## Set3DPhysicsCharacterControllerFallSpeed
### Описание
Устанавливает скорость, с которой контроллер будет падать.
### Определение
```php
void agk::Set3DPhysicsCharacterControllerFallSpeed( UINT objID, float fallSpeed )
```
### Параметры
```php
objID - идентификатор объекта
fallSpeed - Значение по умолчанию-55,0, что является конечной скоростью скай-дайвера в метрах в секунду.
```
### Пример кода
---
## SaveObjectShape
### Описание
Сохраняет форму столкновения объектов в файл .bcs (Bullet Collision Shape). Возвращает true, если это удалось.
### Определение
```php
int agk::SaveObjectShape( UINT objID, const char* fileName )
```
### Параметры
```php
objID - идентификатор объекта
fileName - имя файла в виде строки.
```
### Пример кода
---
## Rotate3DPhysicsCharacterController
### Описание
Вращает контроллер.
### Определение
```php
void agk::Rotate3DPhysicsCharacterController( UINT objID, float angle )
```
### Параметры
```php
objID - идентификатор объекта
angle - количество в градусах
```
### Пример кода
---
## Reset3DPhysicsWorld
### Описание
Это удаляет физический мир и все формы, твердые тела, суставы, совместные двигатели, тряпичные куклы и контроллеры персонажей. Затем воссоздается пустой физический мир с масштабом и гравитацией по умолчанию. Затем вам нужно будет воссоздать все формы, твердые тела, суставы, совместные двигатели, тряпичные куклы и контроллеры персонажей, которые вам нужны.
### Определение
```php
void agk::Reset3DPhysicsWorld()
```
### Параметры
```php
```
### Пример кода
---
## RayCast3DPhysicsObject
### Описание
Бросьте луч и проверьте объект.
### Определение
```php
int agk::RayCast3DPhysicsObject( UINT objID, UINT rayID, int fromVec3ID, int toVec3ID, int allOrClosest )
```
### Параметры
```php
objID - Идентификатор объекта для проверки.
rayID - Идентификатор луча
fromVec3ID - Идентификатор вектора начальной точки. Создайте вектор с помощью команды CreateVector3 ().
toVec3ID - Идентификатор вектора назначения
allOrClosest - 1 = все контакты, 0 = ближайший контакт
```
### Пример кода
---
## RayCast3DPhysics
### Описание
Бросьте луч
### Определение
```php
void agk::RayCast3DPhysics( UINT rayID, int fromVec3ID, int toVec3ID, int allOrClosest )
```
### Параметры
```php
rayID - Идентификатор луча
fromVec3ID - Идентификатор вектора начальной точки. Создайте вектор с помощью команды CreateVector3 ().
toVec3ID - Идентификатор вектора назначения
allOrClosest - 1 = все контакты, 0 = ближайший контакт
```
### Пример кода
---
## Ray3DPhysicsExist
### Описание
Верните 1, если луч существует. Возвращает 0, если это не так.
### Определение
```php
int agk::Ray3DPhysicsExist( UINT rayID )
```
### Параметры
```php
rayID - Идентификатор луча
```
### Пример кода
---
## Move3DPhysicsCharacterController
### Описание
Перемещает контроллер.
### Определение
```php
void agk::Move3DPhysicsCharacterController( UINT objID, float x, float z, float velocity )
void agk::Move3DPhysicsCharacterController( UINT objID, int direction, float velocity )
```
### Параметры
```php
objID - идентификатор объекта
x - Сумма, которая будет двигаться в направлении x, будет нормализована с направлением z
z - Сумма, которая будет двигаться в направлении z, будет нормализована с направлением x
velocity - скорость перемещения
direction - 0 = стоп, 1 = вперед, 2 = назад, 3 = стрейф влево, 4 = стрейф вправо
```
### Пример кода
---
## LoadObjectShape
### Описание
загружает форму столкновения из файла .bcs (Bullet Collision Shape) и устанавливает ее на объект. Возвращает true, если это удалось.
### Определение
```php
int agk::LoadObjectShape( UINT objID, const char* fileName )
```
### Параметры
```php
objID - идентификатор объекта
fileName - имя файла
```
### Пример кода
---
## Jump3DPhysicsCharacterController
### Описание
Перемещает контроллер вверх на высоту прыжка.
### Определение
```php
void agk::Jump3DPhysicsCharacterController( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Is3dPhysicsRagdollStatic
### Описание
Возвращает 1, если Тряпичная кукла статична.
### Определение
```php
int agk::Is3dPhysicsRagdollStatic( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObjects3DPhysicsContactPositionVector
### Описание
Заполняет outPosVec3 контактным положением. Возвращает false, если нет контакта. Сначала создайте вектор с помощью CreateVector3 (), а затем передайте идентификатор. Вектор, который вы создали и передали, будет заполнен результатами.
### Определение
```php
int agk::GetObjects3DPhysicsContactPositionVector( UINT objA, UINT objB, int outPosVec3 )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
outPosVec3 - Идентификатор вектора положения, который должен быть заполнен. Сначала создайте этот вектор.
```
### Пример кода
---
## GetObject3DPhysicsRollingFriction
### Описание
Возвращает трение качения для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsRollingFriction( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsRestitution
### Описание
Возвращает текущее значение реституции для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsRestitution(  UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsNextContact
### Описание
Возвращает true, если есть еще один контакт для отчета.
### Определение
```php
int agk::GetObject3DPhysicsNextContact()
```
### Параметры
```php
```
### Пример кода
---
## GetObject3DPhysicsMaxLinearVelocity
### Описание
Возвращает максимальную линейную скорость для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsMaxLinearVelocity( uint32_t objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsMass
### Описание
Возвращает массу объектов
### Определение
```php
float agk::GetObject3DPhysicsMass( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsMask
### Описание
Возвращает маску столкновения объектов. По умолчанию все физические объекты находятся в одной группе и не маскируются. Если вы используете группы столкновений и маски, вы должны использовать их для всех физических объектов.
### Определение
```php
int agk::GetObject3DPhysicsMask( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsLinearVelocityZ
### Описание
Возвращает X-компоненту вектора линейной скорости.
### Определение
```php
float agk::GetObject3DPhysicsLinearVelocityZ( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsLinearVelocityY
### Описание
Возвращает X-компоненту вектора линейной скорости.
### Определение
```php
float agk::GetObject3DPhysicsLinearVelocityY( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsLinearVelocityX
### Описание
Возвращает X-компоненту вектора линейной скорости.
### Определение
```php
float agk::GetObject3DPhysicsLinearVelocityX( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsLinearSleepingThreshold
### Описание
Возвращает линейный порог сна для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsLinearSleepingThreshold( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsGroup
### Описание
Возвращает группу столкновений объектов. По умолчанию все физические объекты находятся в одной группе и не маскируются. Если вы используете группы столкновений и маски, вы должны использовать их для всех физических объектов.
### Определение
```php
int agk::GetObject3DPhysicsGroup( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsLinearDamp
### Описание
Возвращает значение линейного демпфирования
### Определение
```php
float agk::GetObject3DPhysicsLinearDamp( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsFriction
### Описание
Возвращает трение для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsFriction( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsFirstContact
### Описание
Возвращает true, если объект имел контакт на физическом шаге.
### Определение
```php
int agk::GetObject3DPhysicsFirstContact( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsContactY
### Описание
Возвращает положение контакта Y
### Определение
```php
float agk::GetObject3DPhysicsContactY()
```
### Параметры
```php
```
### Пример кода
---
## GetObject3DPhysicsContactX
### Описание
Возвращает X положение контакта
### Определение
```php
float agk::GetObject3DPhysicsContactX()
```
### Параметры
```php
```
### Пример кода
---
## GetObject3DPhysicsContactVector
### Описание
Возвращает true, если есть контактный вектор, и заполняет вектор outPosVec3. Сначала создайте вектор с помощью CreateVector3 (), а затем передайте идентификатор. Вектор, который вы создали и передали, будет заполнен результатами.
### Определение
```php
int agk::GetObject3DPhysicsContactVector(int outPosVec3)
```
### Параметры
```php
outPosVec3 - Идентификатор вектора, который будет заполнен результатами.
```
### Пример кода
---
## GetObject3DPhysicsContactObjectB
### Описание
Возвращает идентификатор объекта второго объекта в контакте.
### Определение
```php
int agk::GetObject3DPhysicsContactObjectB()
```
### Параметры
```php
```
### Пример кода
---
## GetObject3DPhysicsAngularVelocityZ
### Описание
Верните Z-компоненту вектора угловой скорости.
### Определение
```php
float agk::GetObject3DPhysicsAngularVelocityZ( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsAngularVelocityY
### Описание
Верните Y-компоненту вектора угловой скорости.
### Определение
```php
float agk::GetObject3DPhysicsAngularVelocityY( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsAngularVelocityX
### Описание
Верните X-компоненту вектора угловой скорости.
### Определение
```php
float agk::GetObject3DPhysicsAngularVelocityX( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsAngularSleepingThreshold
### Описание
Возвращает порог углового сна для физического объекта.
### Определение
```php
float agk::GetObject3DPhysicsAngularSleepingThreshold( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsAngularDamp
### Описание
Возвращает значение углового демпфирования
### Определение
```php
float agk::GetObject3DPhysicsAngularDamp( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## GetObject3DPhysicsContactZ
### Описание
Возвращает Z положение контакта
### Определение
```php
float agk::GetObject3DPhysicsContactZ()
```
### Параметры
```php
```
### Пример кода
---
## Get3DPhysicsTotalObjects
### Описание
Возвращает общее количество физических объектов в мире.
### Определение
```php
int agk::Get3DPhysicsTotalObjects()
```
### Параметры
```php
```
### Пример кода
---
## Get3DPhysicsTotalJoints
### Описание
Возвращает общее количество суставов в физическом мире
### Определение
```php
int agk::Get3DPhysicsTotalJoints()
```
### Параметры
```php
```
### Пример кода
---
## Get3DPhysicsRayCastNumHits
### Описание
Возвращает общее количество попаданий луча по его длине.
### Определение
```php
int agk::Get3DPhysicsRayCastNumHits( UINT rayID )
```
### Параметры
```php
rayID - Идентификатор луча, который возвращается вызовом Create3DPhysicsRay().
```
### Пример кода
---
## Get3DPhysicsRayCastFraction
### Описание
Возвращает расстояние вдоль луча до столкновения, где 1.0 = полная длина, 0.0 = начало.
### Определение
```php
float agk::Get3DPhysicsRayCastFraction( UINT rayID )
```
### Параметры
```php
rayID - Идентификатор луча
```
### Пример кода
---
## Get3DPhysicsRayCastObjectHit
### Описание
Возвращает идентификатор объекта, пораженного лучом по индексу.
### Определение
```php
int agk::Get3DPhysicsRayCastObjectHit( UINT rayID, float fractionIndex )
```
### Параметры
```php
rayID - Идентификатор луча
fractionIndex - значение, возвращаемое командой Get3DPhysicsRayCastFraction ().
```
### Пример кода
---
## Get3DPhysicsRayCastNormalVector
### Описание
Заполняет переданный вектор значениями нормалей от луча. сначала создайте физический луч, а затем бросьте его перед вызовом Get3DPhysicsRayCastNormalVector().
### Определение
```php
void agk::Get3DPhysicsRayCastNormalVector( UINT rayID, int returnVec3ID )
```
### Параметры
```php
rayID - Идентификатор луча, который возвращается вызовом Create3DPhysicsRay().
returnVec3ID - Идентификатор вектора. Vector ID-это возвращаемое значение команды CreateVector3 ().
```
### Пример кода
---
## Get3DPhysicsRayCastContactPosition
### Описание
Возвращает true, если есть контактный вектор, и заполняет вектор outVec3ID. Сначала создайте вектор с помощью CreateVector3 (), а затем передайте идентификатор. Вектор, который вы создали и передали, будет заполнен результатами.
### Определение
```php
int agk::Get3DPhysicsRayCastContactPosition( UINT rayID, float fractionIndex, int outVec3ID )
```
### Параметры
```php
rayID - Идентификатор луча
fractionIndex - значение, возвращаемое командой Get3DPhysicsRayCastFraction ().
outVec3ID - Идентификатор вектора, который будет заполнен позицией.
```
### Пример кода
---
## Get3DPhysicsRagdollFromBoneObject
### Описание
Возвращает идентификатор объекта модели с ragdoll, который содержит переданный объект ragdoll bone.
### Определение
```php
int agk::Get3DPhysicsRagdollFromBoneObject( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта костной капсулы тряпичной куклы.
```
### Пример кода
---
## Get3DPhysicsRagdollExist
### Описание
Возвращает true, если для объекта существует тряпичная кукла.
### Определение
```php
int agk::Get3DPhysicsRagdollExist( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Get3DPhysicsJointRotationVector
### Описание
Возвращает угол поворота суставов X в градусах
### Определение
```php
int agk::Get3DPhysicsJointRotationVector( UINT jointID )
```
### Параметры
```php
jointID - Идентификатор сустава.
```
### Пример кода
---
## Get3DPhysicsRayCastClosestContactPosition
### Описание
Возвращает true, если существует ближайший контактный вектор, и заполняет вектор outVec3ID. Сначала создайте вектор с помощью CreateVector3 (), а затем передайте идентификатор. Вектор, который вы создали и передали, будет заполнен результатами.
### Определение
```php
int agk::Get3DPhysicsRayCastClosestContactPosition( UINT rayID, int outVec3ID )
```
### Параметры
```php
rayID - Идентификатор луча
outVec3ID - Идентификатор вектора, который будет заполнен позицией.
```
### Пример кода
---
## Get3DPhysicsJointPositionVector
### Описание
Возвращает идентификатор вектора
### Определение
```php
int agk::Get3DPhysicsJointPositionVector( UINT jointID )
```
### Параметры
```php
jointID - Идентификатор сустава
```
### Пример кода
---
## Get3DPhysicsRayCastClosestObjectHit
### Описание
Верните ближайший объект, пораженный лучом.
### Определение
```php
int agk::Get3DPhysicsRayCastClosestObjectHit( UINT rayID )
```
### Параметры
```php
rayID - Идентификатор луча
```
### Пример кода
---
## Get3DPhysicsCharacterControllerMaxSlope
### Описание
Возвращает максимальный наклон в градусах.
### Определение
```php
float agk::Get3DPhysicsCharacterControllerMaxSlope( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Get3DPhysicsCharacterControllerGravity
### Описание
Возвращает контроллер гравитации.
### Определение
```php
float agk::Get3DPhysicsCharacterControllerGravity( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Get3DPhysicsCharacterControllerExists
### Описание
Возвращает 1, если объект имеет контроллер, в противном случае 0.
### Определение
```php
int agk::Get3DPhysicsCharacterControllerExists( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Get3DPhysicsActiveObjects
### Описание
Возвращает общее количество активных объектов в физическом мире.
### Определение
```php
int agk::Get3DPhysicsActiveObjects()
```
### Параметры
```php
```
### Пример кода
---
## Get3DPhysicsJointEnabled
### Описание
Возвращает порог разрыва соединения.
### Определение
```php
int agk::Get3DPhysicsJointEnabled( UINT jointID )
```
### Параметры
```php
jointID - Id соединения
```
### Пример кода
---
## Finalize3DPhysicsRagDoll
### Описание
Заканчивает строительство тряпичной куклы. Вызовите эту команду, когда вы добавите все кости и суставы для вашей тряпичной куклы. Убедитесь, что вы сначала вызвали Create3DPhysicsRagDoll, прежде чем вызывать эту команду.
### Определение
```php
void agk::Finalize3DPhysicsRagDoll()
```
### Параметры
```php
```
### Пример кода
---
## Delete3DPhysicsWorld
### Описание
Удаляет весь мир 3D - физики.
### Определение
```php
void agk::Delete3DPhysicsWorld()
```
### Параметры
```php
```
### Пример кода
---
## Delete3DPhysicsStaticPlane
### Описание
Удаляет статическую плоскость.
### Определение
```php
void agk::Delete3DPhysicsStaticPlane( UINT planeID )
```
### Параметры
```php
planeID - статический идентификатор плоскости
```
### Пример кода
---
## Delete3DPhysicsRay
### Описание
Удаляет физический луч и все связанные с ним данные.
### Определение
```php
void agk::Delete3DPhysicsRay( UINT rayID )
```
### Параметры
```php
rayID - Идентификатор луча для удаления.
```
### Пример кода
---
## Delete3DPhysicsRagdoll
### Описание
Удаляет тряпичную куклу для объекта.
### Определение
```php
void agk::Delete3DPhysicsRagdoll( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Delete3DPhysicsJoint
### Описание
Удаляет физический стык
### Определение
```php
void agk::Delete3DPhysicsJoint( UINT jointID )
```
### Параметры
```php
jointID - Id соединения
```
### Пример кода
---
## Delete3DPhysicsCharacterController
### Описание
Удаляет контроллер для объекта.
### Определение
```php
void agk::Delete3DPhysicsCharacterController( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Delete3DPhysicsPickJoint
### Описание
Удаляет соединение кирки.
### Определение
```php
void agk::Delete3DPhysicsPickJoint( UINT jointID )
```
### Параметры
```php
jointID - Id соединения
```
### Пример кода
---
## Debug3DPhysicsCharacterController
### Описание
Показывает объекты капсулы, представляющие контроллер.
### Определение
```php
void agk::Debug3DPhysicsCharacterController( UINT objID, int isDebug )
```
### Параметры
```php
objID - идентификатор объекта
isDebug - 1 = истина, 0 = ложь
```
### Пример кода
---
## Debug3DPhysicsWorld
### Описание
Вызовите цикл перед физикой шага. Рисует отладочное наложение 3D-физического мира. Примечание: Эта команда в настоящее время не работает, требуется возможность рисовать каркас в AGK.
### Определение
```php
void agk::Debug3DPhysicsWorld()
```
### Параметры
```php
```
### Пример кода
---
## Delete3DPhysicsBody
### Описание
Удаляет физическое тело из мира и удаляет его.
### Определение
```php
void agk::Delete3DPhysicsBody( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Crouch3DPhysicsCharacterController
### Описание
Приседает контроллер
### Определение
```php
void agk::Crouch3DPhysicsCharacterController( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Create3DPhysicsWorld
### Описание
Вы должны создать физический мир, прежде чем вызывать какие-либо другие физические команды. Create3DPhysicsWorld Создает физический мир, используя масштабный коэффициент по умолчанию 40. Эта функция создаст физический мир с другим масштабным коэффициентом. Масштаб-это не размер мира, это фактор, с помощью которого все передаваемые данные уменьшаются, чтобы преобразовать их в шкалу физики Пули для физических вычислений. Затем данные из Bullet масштабируются до того, как они будут переданы в AGK 3D world. Масштабный коэффициент по умолчанию будет правильным, если ваш средний размер символа составляет 72 единицы AGK. Тогда гравитация по умолчанию -10,0 метра в секунду на оси Y даст правильный визуальный результат. Решатель физики пуль имеет минимальный размер для объектов. Объекты ниже этого размера вызовут нестабильность в работе решателя. При масштабном коэффициенте по умолчанию 40 наименьший размер, который может обрабатывать решатель, составляет около 3,5 единиц AGK. Чтобы вычислить масштабный коэффициент, сначала определите рост вашего персонажа в метрах, символ высотой 72 единицы будет равен 1,8288 метра (или 6 футов). Затем разделите высоту персонажа в единицах на высоту символов в метрах, для этого примера масштабный коэффициент будет равен (72 / 1.8) = 40.
### Определение
```php
void agk::Create3DPhysicsWorld( float scaleFactor )
void agk::Create3DPhysicsWorld()
```
### Параметры
```php
scaleFactor - Масштабный коэффициент по умолчанию равен 40.
```
### Пример кода
---
## Create3DPhysicsStaticPlane
### Описание
Создает статическую плоскость. Возвращает статический идентификатор плоскости
### Определение
```php
int agk::Create3DPhysicsStaticPlane( float normalX, float normalY, float normalZ, float offsetPosition )
```
### Параметры
```php
normalX - x значение вектора нормали.
normalY - значение y вектора нормали.
normalZ - z-значение вектора нормали.
offsetPosition - Насколько самолет будет смещен от своего мирового положения.
```
### Пример кода
---
## Create3DPhysicsStaticBody
### Описание
Удаляет существующее физическое тело и создает статическую форму столкновения треугольной сетки и физическое тело для объекта.
### Определение
```php
void agk::Create3DPhysicsStaticBody( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Create3DPhysicsRay
### Описание
Возвращает идентификатор созданного луча.
### Определение
```php
int agk::Create3DPhysicsRay()
```
### Параметры
```php
```
### Пример кода
---
## Create3DPhysicsSliderJoint
### Описание
Создает соединение ползунков между объектами a и b. Параметр rotationVec3 должен быть осью в виде (0,1,0) для вертикали, (1,0,0) для горизонтали вдоль оси X, (0,0,1) для горизонтали вдоль оси Z или любой их комбинации. Вектор вращения не нуждается в нормализации. Возвращает идентификатор соединения.
### Определение
```php
int agk::Create3DPhysicsSliderJoint( UINT objA, UINT objB, int positionVec3, int rotationVec3 )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
positionVec3 - векторный ИДЕНТИФИКАТОР
rotationVec3 - векторный ИДЕНТИФИКАТОР
```
### Пример кода
---
## Create3DPhysicsRagDoll
### Описание
Начинается создание физической тряпичной куклы для объекта. Вы должны добавить по крайней мере одну кость к ragdoll, прежде чем вызывать Finalize3DPhysicsRagDoll(). Кости моделей должны иметь нулевое вращение в положении по умолчанию/первом кадре анимации.
### Определение
```php
void agk::Create3DPhysicsRagDoll( UINT objID, float objTotalWeight )
```
### Параметры
```php
objID - идентификатор объекта
objTotalWeight - Общий вес в фунтах. Этот вес делится между костями тряпичной куклы в зависимости от объема костей.
```
### Пример кода
---
## Create3DPhysicsPickJoint
### Описание
Возвращает идентификатор соединения
### Определение
```php
int agk::Create3DPhysicsPickJoint( UINT objID, int positionVec3 )
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора положения
```
### Пример кода
---
## Create3DPhysicsKinematicBody
### Описание
Удаляет существующее физическое тело и создает форму столкновения коробки и кинематическое физическое тело для объекта. Кинематическое тело может быть перемещено с помощью команд agk для позиционирования и вращения объектов. Примечание: Кинематическое тело может взаимодействовать только с динамическим телом и будет проходить через статическое тело.
### Определение
```php
void agk::Create3DPhysicsKinematicBody( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Create3DPhysicsHingeJoint
### Описание
Создает шарнирное соединение между объектами a и b. Параметр rotationVec3 должен быть осью в виде (0,1,0) для вертикали, (1,0,0) для горизонтали вдоль оси X, (0,0,1) для горизонтали вдоль оси Z или любой их комбинации. Вектор вращения не нуждается в нормализации. Возвращает идентификатор соединения.
### Определение
```php
int agk::Create3DPhysicsHingeJoint( UINT objA, UINT objB, int positionVec3, int rotationVec3, int disableCollisions )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
positionVec3 - векторный ИДЕНТИФИКАТОР
rotationVec3 - векторный ИДЕНТИФИКАТОР
disableCollisions - 1 = коллизии будут отключены между связанными объектами, 0 коллизий будут включены между связанными объектами.
```
### Пример кода
---
## Create3DPhysicsFixedJoint
### Описание
Создает фиксированное соединение между объектами a и b. Возвращает идентификатор соединения.
### Определение
```php
int agk::Create3DPhysicsFixedJoint( UINT objA, UINT objB, int positionVec3 )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
positionVec3 - векторный ИДЕНТИФИКАТОР
```
### Пример кода
---
## Create3DPhysicsCharacterController
### Описание
Создает 3D-физический контроллер символов для модели. Контроллер символов может быть создан на оси X, Y или Z. Например, стоящий символ будет находиться на оси Y. Лежащий персонаж может быть на X или Z. Если модель имеет смещение от начала координат, objOffsetVec3 необходим для выравнивания символьного контроллера с объектом. Если объект не обращен лицом вниз к положительной оси Z, используйте objOrientationVec3 для настройки. Шкала приседания регулирует размер капсулы приседания в соответствии с высотой вашей модели приседания.
### Определение
```php
void agk::Create3DPhysicsCharacterController( UINT objID, int axis, int objOffsetVec3, int objOrientationVec3, float crouchScale )
```
### Параметры
```php
objID - идентификатор объекта
axis - 0 = Ось X, 1= ось Y, 2 = ось Z,
objOffsetVec3 - Этот вектор составляет половину суммы, которую модель смещает от начала координат.
objOrientationVec3 - Этот вектор используется для выравнивания вращения вашей модели с контроллером символов.
crouchScale - Процентная величина для масштабирования скорченной капсулы в соответствии с согнутой моделью.
```
### Пример кода
---
## Create3DPhysicsDynamicBody
### Описание
Удаляет существующее физическое тело и создает динамическое тело для объекта с коробчатой формой столкновения и массой 5,0 В зависимости от размера объекта.
### Определение
```php
void agk::Create3DPhysicsDynamicBody( UINT objID )
```
### Параметры
```php
objID - идентификатор объекта
```
### Пример кода
---
## Create3DPhysicsConeTwistJoint
### Описание
Создает конусообразное скручивающее соединение между объектами а и в. Параметр rotationVec3 должен быть осью в виде (0,1,0) для вертикали, (1,0,0) для горизонтали вдоль оси X, (0,0,1) для горизонтали вдоль оси Z или любой их комбинации. Вектор вращения не нуждается в нормализации. Шарнир будет вращаться вдоль заданной оси и свободно вращаться внутри конуса вдоль этой оси. Пределы конуса можно задать с помощью Set3DPhysicsJointConeTwistLimits. Возвращает идентификатор соединения.
### Определение
```php
int agk::Create3DPhysicsConeTwistJoint( UINT objA, UINT objB, int positionVec3, int rotationVec3, int disableCollisions )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
positionVec3 - векторный ИДЕНТИФИКАТОР
rotationVec3 - векторный ИДЕНТИФИКАТОР
disableCollisions - 1 = коллизии будут отключены между связанными объектами, 0 коллизий будут включены между связанными объектами.
```
### Пример кода
---
## Create3DPhysics6DOFJoint
### Описание
Создает соединение 6 степеней свободы между объектами a и b. Возвращает идентификатор соединения.
### Определение
```php
int agk::Create3DPhysics6DOFJoint( UINT objA, UINT objB, int positionVec3, float rotationVec3 )
```
### Параметры
```php
objA - первый идентификатор объекта
objB - второй идентификатор объекта
positionVec3 - векторный ИДЕНТИФИКАТОР
rotationVec3 - векторный ИДЕНТИФИКАТОР
```
### Пример кода
---
## AddObjectShapeSphere
### Описание
Добавляет форму столкновения сфер к составной форме. Сначала установите форму объектов в составную форму столкновения с помощью SetObjectShapeCompound().
### Определение
```php
void agk::AddObjectShapeSphere( int objID, int positionVec3, float diameter )
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора вектора с мировым положением для центра фигуры.
diameter - размер формы сферы
```
### Пример кода
---
## AddObjectShapeCylinder
### Описание
Добавляет форму столкновения цилиндров к сложной форме. Сначала установите форму объектов в составную форму столкновения с помощью SetObjectShapeCompound().
### Определение
```php
void agk::AddObjectShapeCylinder( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis)
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора вектора с мировым положением для центра фигуры.
rotationVec3 - Вектор ID вектора с мировым вращением фигуры.
sizeVec3 - Идентификатор вектора вектора с размером фигуры.
axis - 0 = ось X, 1 = ось Y, 2 = ось Z.
```
### Пример кода
---
## AddObjectShapeCone
### Описание
Добавляет форму столкновения конуса к сложной форме. Сначала установите форму объектов в составную форму столкновения с помощью SetObjectShapeCompound().
### Определение
```php
void agk::AddObjectShapeCone( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis)
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора вектора с мировым положением для центра фигуры.
rotationVec3 - Вектор ID вектора с мировым вращением фигуры.
sizeVec3 - Идентификатор вектора вектора с размером фигуры.
axis - 0 = ось X, 1 = ось Y, 2 = ось Z.
```
### Пример кода
---
## AddObjectShapeCapsule
### Описание
Добавляет форму столкновения капсул к сложной форме. Сначала установите форму объектов в составную форму столкновения с помощью SetObjectShapeCompound().
### Определение
```php
void agk::AddObjectShapeCapsule( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis )
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора вектора с мировым положением для центра фигуры.
rotationVec3 - Вектор ID вектора с мировым вращением фигуры.
sizeVec3 - Идентификатор вектора вектора с размером фигуры.
axis - 0 = ось X, 1 = ось Y, 2 = ось Z.
```
### Пример кода
---
## AddObjectShapeBox
### Описание
Добавляет форму столкновения коробок к составной форме. Сначала установите форму объектов в составную форму столкновения с помощью SetObjectShapeCompound().
### Определение
```php
void agk::AddObjectShapeBox( int objID, int positionVec3, int rotationVec3, int sizeVec3 )
```
### Параметры
```php
objID - идентификатор объекта
positionVec3 - Идентификатор вектора вектора с мировым положением для центра фигуры.
rotationVec3 - Вектор ID вектора с мировым вращением фигуры.
sizeVec3 - Идентификатор вектора вектора с размером фигуры.
```
### Пример кода
---
## Add3DPhysicsRagDollBone
### Описание
Создает костную капсулу тряпичной куклы между начальным и конечным расположением костей объектов. Возвращает идентификатор кости рэгдолла. Если эта команда не сможет создать кость, она вернет значение -1.
### Определение
```php
int agk::Add3DPhysicsRagDollBone( UINT startBoneID, UINT endBoneID, float diameter, int collisionGroup, int collisionMask )
```
### Параметры
```php
startBoneID - объекты bone ID
endBoneID - объекты bone ID
diameter - размер капсулы, которая будет костью тряпичной куклы.
collisionGroup - группа столкновений, к которой принадлежит и этот физический объект.
collisionMask - группы столкновений, которые вы хотите замаскировать от столкновения.
```
### Пример кода
---
# Список методов в категории Sound:
## VibrateDevice
### Описание
Вибрирует устройство в течение заданного количества секунд. Работает на iOS и Android. Обратите внимание, что на iOS значение длины игнорируется и происходит только короткая вибрация, это связано с ограничениями Apple.
### Определение
```php
void agk::VibrateDevice( float seconds )
```
### Параметры
```php
seconds - Время в секундах для вибрации
```
### Пример кода
---
## TextToSpeechSetup
### Описание
Инициализирует механизм преобразования текста в речь на устройстве, чтобы он мог воспроизводить звук. Обратите внимание, что это может быть не сразу, вы должны проверить GetTextToSpeechReady, чтобы увидеть, закончил ли он настройку. Вызов других команд преобразования текста в речь, когда он не готов, будет проигнорирован.  В настоящее время работает только на iOS и Android.
### Определение
```php
void agk::TextToSpeechSetup()
```
### Параметры
```php
undefined
```
### Пример кода
---
## StopSoundRecording
### Описание
Еще не функционирует.
### Определение
```php
void agk::StopSoundRecording()
```
### Параметры
```php
undefined
```
### Пример кода
---
## StopSoundInstance
### Описание
Останавливает текущий экземпляр, если он еще этого не сделал. При этом экземпляр удаляется, и его идентификатор больше не может быть использован. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука.
### Определение
```php
void agk::StopSoundInstance( UINT iID )
```
### Параметры
```php
iID - Идентификатор проверяемого экземпляра
```
### Пример кода
---
## StopSpeaking
### Описание
Немедленно останавливает любой произносимый текст и удаляет все элементы из очереди.  В настоящее время работает только на iOS и Android.
### Определение
```php
void agk::StopSpeaking()
```
### Параметры
```php
undefined
```
### Пример кода
---
## StopSound
### Описание
Остановите звук, воспроизводимый в данный момент на указанном звуковом номере.
### Определение
```php
void agk::StopSound( UINT iID )
```
### Параметры
```php
iID - Звук, по-видимому, прекратился.
```
### Пример кода
---
## Speak
### Описание
Ставит данный текст в очередь для произнесения. Если какой - то текст уже произносится, то данный текст будет произнесен после окончания текущей речи. Эта команда может быть вызвана несколько раз в быстрой последовательности, чтобы поставить в очередь много текста. Вы можете вызвать IsSpeaking, чтобы проверить, когда очередь пуста и весь текст был произнесен или отменен. Обратите внимание, что при первом вызове этой команды может возникнуть задержка при установке незнакомого языка с помощью SetSpeechLanguage. Например, использование французского языка на устройстве, настроенном для английского языка, попытается загрузить движок французского языка, прежде чем начать говорить текст.  Если приложение будет отправлено в фоновый режим, то речь остановится, и весь текст будет удален из очереди.  Вы можете указать необязательную задержку в миллисекундах, чтобы устройство подождало, прежде чем начать произносить текст.  В настоящее время работает только на iOS и Android.
### Определение
```php
void agk::Speak( const char *text )
void agk::Speak( const char *text, int delay )
```
### Параметры
```php
text - Текст для выступления
delay - Количество времени в миллисекундах ожидания перед запуском речевого вывода
```
### Пример кода
---
## SetSpeechRate
### Описание
Устанавливает скорость речи, где 1.0-нормальная скорость, 2.0-двойная скорость, 0.5-половинная скорость и так далее.  В настоящее время работает только на iOS и Android.
### Определение
```php
void agk::SetSpeechRate( float rate )
```
### Параметры
```php
rate - Скорость произнесения текста по умолчанию равна 1,0
```
### Пример кода
---
## SetSpeechLanguageByID
### Описание
Задает язык, используемый при произнесении текста по голосовому идентификатору. Идентификатор можно найти с помощью GetSpeechVoiceID и необходим, когда несколько голосов имеют один и тот же язык, но с разными акцентами.
### Определение
```php
void agk::SetSpeechLanguageByID( const char* sID )
```
### Параметры
```php
sID - Язык, используемый для произнесения текста, по умолчанию является текущим языком устройства.
```
### Пример кода
---
## SetSpeechLanguage
### Описание
Задает язык, используемый при произнесении текста, например en_GB для британского английского, en_US для американского английского, fr_FR для французского и т. Д. Если языковой движок в данный момент не находится на устройстве, то устройство попытается загрузить его при следующем вызове Speak, что может привести к задержке перед произнесением этого текста. Если загрузка завершится неудачно или подключение к Интернету будет недоступно, то будет использоваться языковой движок по умолчанию для текущего устройства.  В настоящее время работает только на iOS и Android.
### Определение
```php
void agk::SetSpeechLanguage( const char* lang )
```
### Параметры
```php
lang - Язык, используемый для произнесения текста, по умолчанию является текущим языком устройства.
```
### Пример кода
---
## SetSoundSystemVolume
### Описание
Устанавливает основную громкость звука для всех звуков. Отдельные объемы звука останутся нетронутыми, но все объемы умножаются на основную громкость звука, позволяя использовать такие функции, как затухание.
### Определение
```php
void agk::SetSoundSystemVolume( int iVol )
```
### Параметры
```php
iVol - Основная громкость звука для всех звуков.
```
### Пример кода
---
## SetSoundInstanceVolume
### Описание
Устанавливает текущий объем указанного экземпляра в диапазоне от 0 до 100. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука.
### Определение
```php
void agk::SetSoundInstanceVolume( UINT iID, int vol )
```
### Параметры
```php
iID - Идентификатор экземпляра для изменения
```
### Пример кода
---
## SetSoundInstanceRate
### Описание
Устанавливает текущую скорость воспроизведения указанного экземпляра, где 1.0-нормальная скорость, 2.0 - двойная скорость и так далее. Не все устройства гарантированно поддерживают изменение скорости воспроизведения. Используйте GetSoundMaxRate и GetSoundMinRate для проверки допустимых диапазонов для текущего устройства, любые значения вне этого диапазона будут зажаты. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука.
### Определение
```php
void agk::SetSoundInstanceRate( UINT iID, float rate )
```
### Параметры
```php
iID - Идентификатор экземпляра для изменения
```
### Пример кода
---
## SetSoundInstanceBalance
### Описание
Устанавливает текущий баланс указанного экземпляра, при этом 0 находится по центру, -1.0-все на левом динамике, а 1.0-все на правом динамике, любые значения вне этого диапазона будут зажаты. Это лучше всего работает с моно-звуками, но может быть применено и к стереозвукам. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука.
### Определение
```php
void agk::SetSoundInstanceBalance( UINT iID, float balance )
```
### Параметры
```php
iID - Идентификатор экземпляра для изменения
```
### Пример кода
---
## SetSoundDeviceMode
### Описание
Устанавливает, будет ли приложение разрешать фоновую музыку из других приложений продолжать воспроизведение (режим=0) или отключать другие приложения, пока это приложение активно (режим=1). Обратите внимание, что в режиме 0 устройство считает звук вашего приложения несущественным, поэтому будет отключено, если звонок устройства установлен в бесшумное состояние. Это работает только на iOS.
### Определение
```php
void agk::SetSoundDeviceMode( int mode )
```
### Параметры
```php
mode - Используемый звуковой режим (по умолчанию=0)
```
### Пример кода
---
## SaveSound
### Описание
Сохраняет звуковой файл в папку записи приложения.
### Определение
```php
void agk::SaveSound( UINT iID, const char* sFilename )
```
### Параметры
```php
iID - Идентификатор звука для сохранения.
```
### Пример кода
---
## RecordSound
### Описание
Еще не функционирует.
### Определение
```php
void agk::RecordSound( const char* szFilename )
```
### Параметры
```php
szFilename - Файл для сохранения звука.
```
### Пример кода
---
## PlaySound
### Описание
Воспроизведение звука, ранее загруженного в указанный звуковой номер. Эта команда может быть вызвана несколько раз для одного и того же идентификатора звука, и она запустит несколько копий этого звука, воспроизводимых в качестве экземпляров. Команда вернет идентификатор экземпляра, который можно использовать для взаимодействия с этим экземпляром во время его воспроизведения. Когда экземпляр перестает воспроизводиться, он автоматически удаляется и больше не может быть использован. По умолчанию звук не зацикливается.
### Определение
```php
UINT agk::PlaySound( UINT iID, int iVol )
UINT agk::PlaySound( UINT iID, int iVol, int iLoop )
UINT agk::PlaySound( UINT iID, int iVol, int iLoop, int iPriority )
UINT agk::PlaySound( UINT iID )
```
### Параметры
```php
iID - Звуковой номер для воспроизведения.
iVol - Громкость, на которой должен воспроизводиться звук (необязательно, по умолчанию 100).
iLoop - Количество раз, чтобы зациклить экземпляр, или 1 навсегда.
iPriority - Зарезервировано для будущего использования, должно быть 0 (необязательно, по умолчанию 0).
```
### Пример кода
---
## LoadSound
### Описание
Загружает звуковой файл из папки мультимедиа приложения и возвращает номер звука. Пути к файлам должны быть относительными, а не абсолютными, вы не можете загружать звуковые файлы из другого места на диске. Обратите внимание, что сжатые WAV-файлы не поддерживаются. Вы должны использовать несжатые WAV-файлы, чтобы обеспечить совместимость на всех платформах.
### Определение
```php
UINT agk::LoadSound( const char* sFilename )
void agk::LoadSound( UINT iID, const char* sFilename )
```
### Параметры
```php
sFilename - Имя файла загружаемого звукового файла должно быть WAV-файлом.
iID - Звуковой номер для хранения звука.
```
### Пример кода
---
## LoadSoundOGG
### Описание
Загружает звуковой файл из папки мультимедиа приложения. Пути к файлам должны быть относительными, а не абсолютными, вы не можете загружать звуковые файлы из других мест на диске. Эта команда берет сжатый OGG-файл и распаковывает его во время загрузки, позволяя вам сохранить размер файла, но использование памяти будет таким же, как если бы вы использовали WAV-файл. Если вы хотите использовать OGG, а также экономить память, то используйте новые команды LoadMusicOGG.
### Определение
```php
void agk::LoadSoundOGG( UINT iID, const char* sFilename )
UINT agk::LoadSoundOGG( const char* sFilename )
```
### Параметры
```php
iID - Звуковой номер для хранения звука.
sFilename - Имя файла загружаемого звукового файла должно быть OGG-файлом.
```
### Пример кода
---
## IsSpeaking
### Описание
Возвращает 1, если Speak был вызван, а текст еще не закончен. Если несколько элементов текста были поставлены в очередь, то эта команда будет продолжать возвращать 1 до тех пор, пока все они не будут произнесены или не будет вызван StopSpeaking.  В настоящее время работает только на iOS и Android.
### Определение
```php
int agk::IsSpeaking()
```
### Параметры
```php
undefined
```
### Пример кода
---
## IsSoundRecording
### Описание
Еще не функционирует.
### Определение
```php
int agk::IsSoundRecording()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetTextToSpeechReady
### Описание
Возвращает 1, когда механизм преобразования текста в речь готов начать преобразование текста в речь. Вызов других команд преобразования текста в речь, когда он не готов, будет проигнорирован.  В настоящее время работает только на iOS и Android.
### Определение
```php
int agk::GetTextToSpeechReady()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetSpeechVoiceName
### Описание
Возвращает имя заданного голоса. На iOS это имя читается человеком, но не дает никаких подробностей о акценте или языке этого голоса. На Android имя дает информацию о языке и акценте, но не так легко читается.  В настоящее время работает только на iOS и Android.
### Определение
```php
char* agk::GetSpeechVoiceName( int index )
```
### Параметры
```php
index - Индекс голоса, который нужно проверить, начинается с 0 для первого голоса
```
### Пример кода
---
## GetSpeechVoiceID
### Описание
Возвращает идентификатор данного голоса. Идентификатор можно использовать с SetSpeechLanguageByID для выбора конкретного голоса.
### Определение
```php
char* agk::GetSpeechVoiceID( int index )
```
### Параметры
```php
index - Индекс голоса, который нужно проверить, начинается с 0 для первого голоса
```
### Пример кода
---
## GetSpeechNumVoices
### Описание
Возвращает количество голосов, которые можно выбрать с помощью команды SetSpeechLanguage. Вы можете использовать команды GetSpeechVoiceName и GetSpeechVoiceLanguage, чтобы получить подробную информацию о различных голосах.  В настоящее время работает только на iOS и Android.
### Определение
```php
int agk::GetSpeechNumVoices()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetSpeechVoiceLanguage
### Описание
Возвращает языковую строку данного голоса. Это можно использовать непосредственно с командой SetSpeechLanguage, чтобы использовать этот голос для любой будущей речи.  В настоящее время работает только на iOS и Android.
### Определение
```php
char* agk::GetSpeechVoiceLanguage( int index )
```
### Параметры
```php
index - Индекс голоса, который нужно проверить, начинается с 0 для первого голоса
```
### Пример кода
---
## GetSoundsPlaying
### Описание
Возвращает количество экземпляров этого звукового идентификатора, которые в данный момент воспроизводятся или зацикливаются. Это точно так же, как GetSoundInstances.
### Определение
```php
UINT agk::GetSoundsPlaying( UINT iID )
```
### Параметры
```php
iID - Звуковой номер для проверки.
```
### Пример кода
---
## GetSoundMinRate
### Описание
Получает минимальную скорость и какие звуковые файлы могут быть воспроизведены на этом устройстве. Скорость 1,0 - это нормальная скорость, скорость 2,0-это двойная скорость, 0,5-половина скорости и так далее. Если вы попытаетесь изменить скорость воспроизведения звука за пределами этих значений, она будет привязана к этим значениям. Если и min, и max возвращают 1.0, то изменение скорости воспроизведения звука на этом устройстве не поддерживается.
### Определение
```php
float agk::GetSoundMinRate()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetSoundMaxRate
### Описание
Получает максимальную скорость и какие звуковые файлы могут быть воспроизведены на этом устройстве. Скорость 1,0 - это нормальная скорость, скорость 2,0-это двойная скорость, 0,5-половина скорости и так далее. Если вы попытаетесь изменить скорость воспроизведения звука за пределами этих значений, она будет привязана к этим значениям. Если и min, и max возвращают 1.0, то изменение скорости воспроизведения звука на этом устройстве не поддерживается.
### Определение
```php
float agk::GetSoundMaxRate()
```
### Параметры
```php
undefined
```
### Пример кода
---
## GetSoundInstances
### Описание
Возвращает количество экземпляров этого звукового идентификатора, которые в данный момент воспроизводятся или зацикливаются. Это точно так же, как GetSoundsPlaying.
### Определение
```php
UINT agk::GetSoundInstances( UINT iID )
```
### Параметры
```php
iID - Звуковой номер для проверки.
```
### Пример кода
---
## GetSoundInstanceRate
### Описание
Возвращает текущую скорость воспроизведения указанного экземпляра, где 1.0-нормальная скорость, 2.0 - двойная скорость и т. Д. Не все устройства гарантированно поддерживают изменение скорости воспроизведения.
### Определение
```php
float agk::GetSoundInstanceRate( UINT iID )
```
### Параметры
```php
iID - Идентификатор проверяемого экземпляра
```
### Пример кода
---
## GetSoundInstanceVolume
### Описание
Возвращает текущий объем указанного экземпляра в диапазоне от 0 до 100.
### Определение
```php
int agk::GetSoundInstanceVolume( UINT iID )
```
### Параметры
```php
iID - Идентификатор проверяемого экземпляра
```
### Пример кода
---
## GetSoundInstancePlaying
### Описание
Возвращает 1, если данный экземпляр все еще воспроизводится или зацикливается, и 0, если он остановился. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука. Как только эта команда вернет 0, экземпляр будет удален и на него больше нельзя будет ссылаться, любая попытка изменить его будет проигнорирована. Вам нужно будет создать новый экземпляр, снова используя PlaySound.
### Определение
```php
int agk::GetSoundInstancePlaying( UINT iID )
```
### Параметры
```php
iID - Идентификатор проверяемого экземпляра
```
### Пример кода
---
## GetSoundInstanceLoopCount
### Описание
Если звук воспроизводился с включенным циклированием, эта команда возвращает количество завершенных до сих пор циклов. Если экземпляр использует фиксированное количество циклов, то он никогда на самом деле не достигнет этого значения количества циклов, так как будет немедленно удален по достижении конца своего последнего цикла. Идентификатор экземпляра - это значение, возвращаемое из PlaySound при инициировании воспроизведения звука.
### Определение
```php
int agk::GetSoundInstanceLoopCount( UINT iID )
```
### Параметры
```php
iID - Идентификатор проверяемого экземпляра
```
### Пример кода
---
## GetSoundExists
### Описание
Возвращает значение 1, если указанный звуковой номер существует, в противном случае возвращается 0.
### Определение
```php
UINT agk::GetSoundExists( UINT iID )
```
### Параметры
```php
iID - Звуковой номер для проверки.
```
### Пример кода
---
## DeleteSound
### Описание
Удалите звук по указанному номеру звука. Это также приведет к удалению всех экземпляров звука.
### Определение
```php
void agk::DeleteSound( UINT iID )
```
### Параметры
```php
iID - Звуковой номер для удаления.
```
### Пример кода
---
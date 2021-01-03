# Checkbox

```html
<checkbox>
    <!-- String Contents -->
</checkbox>
```

## Attributes

| Attribute | Usage(s) | Description | Required |
|  :---:  |  :---:  |  :---:  | :---: |
| `x` | `x="0"` | The `x` position of the element. | ✔️ |
| `y` | `y="0"` | The `y` position of the element. | ✔️ |
| `width` | `width="0"` | The width of the element. | ✔️ |
| `height` | `y=""` | The height of the element.<br>Recommended to be `20` or visual bugs will occur. | ✔️ |
| `defaultstate` | `defaultstate="true"`<br>`defaultstate="false"` | The default state of the checkbox, default false. | ❌ |
| `id` | `id=""` | The identifier of the element, allows the element to be fetched at a later date. | ❌ |
| `loc` | `loc="true"`<br>`loc="false"` | Whether or not the contents of the checkbox is a i18n key.<br>Default false. | ❌ |
| `@render` | `@render="event_method:id"` | Event - When the element is shown to the user (render phase) | ❌ |
| `@changestate` | `@changestate="event_method:id"` | Event - When the checkbox state changes. | ❌ |

## Valid Children

- None